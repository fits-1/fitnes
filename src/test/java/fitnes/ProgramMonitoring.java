package fitnes;

import java.text.ParseException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ProgramMonitoring {

    MyApplication app;

    public ProgramMonitoring() {
        app = new MyApplication(); // إنشاء كائن من MyApplication
    }

    // Scenario: View statistics on the most popular programs by enrollment
    @Given("I am logged in as an admin")
    public void givenIAmLoggedInAsAdmin() {
        app.loginAsAdmin(null, null);
    }

    @When("I navigate to the {string} page")
    public void whenINavigateToPage(String pageName) {
        app.navigateToPage(pageName);
    }

    @When("I select {string} from the options")
    public void whenISelectFromOptions(String option) {
        app.selectOption(option);
    }

    @Then("I should see a list of programs sorted by enrollment numbers")
    public void thenIShouldSeeListSortedByEnrollment() {
        boolean isSorted = app.verifyProgramsSortedByEnrollment();
        assert isSorted : "Programs are not sorted by enrollment numbers!";
    }

    @Then("the data should include program names, total enrollments, and trends over time")
    public void thenDataIncludesProgramDetails() {
        boolean hasRequiredData = app.verifyProgramPopularityData();
        assert hasRequiredData : "Missing program data like names, enrollments, or trends!";
    }

    // Scenario: Generate reports on revenue
    @When("I navigate to the {string} section")
    public void whenINavigateToSection(String section) {
        app.navigateToSection(section);
    }

    @When("I select {string}")
    public void whenISelectReportType(String reportType) {
        app.selectReportType(reportType);
    }

    @When("I specify a date range")
    public void whenISpecifyDateRange() throws ParseException {
        app.setDateRange("01/01/2023", "12/31/2023");
    }

    @When("I click {string}")
    public void whenIClickButton(String button) {
        app.clickButton(button);
    }

    @Then("I should see a detailed revenue report for the selected period")
    public void thenIShouldSeeRevenueReport() {
        boolean isReportGenerated = app.verifyReport("Revenue Report");
        assert isReportGenerated : "Revenue report was not generated!";
    }

    @Then("the report should include total revenue, revenue by program, and payment methods")
    public void thenReportIncludesRevenueDetails() {
        boolean hasRevenueDetails = app.verifyReportDetails("Revenue Report");
        assert hasRevenueDetails : "Missing revenue details in the report!";
    }

    // Scenario: Generate reports on attendance
    @When("I select {string} report")
    public void whenISelectAttendanceReport(String reportType) {
        app.selectReportType(reportType);
    }

    @When("I specify a date range and a program")
    public void whenISpecifyDateRangeAndProgram() throws ParseException {
        app.setDateRange("01/01/2023", "12/31/2023");
        app.selectProgram("HIIT 6-Week Challenge");
    }

    @Then("I should see a detailed attendance report for the selected program and period")
    public void thenIShouldSeeAttendanceReport() {
        boolean isAttendanceReportGenerated = app.verifyReport("Attendance Report");
        assert isAttendanceReportGenerated : "Attendance report was not generated!";
    }

    @Then("the report should include attendance percentages and trends")
    public void thenReportIncludesAttendanceDetails() {
        boolean hasAttendanceDetails = app.verifyAttendanceDetails();
        assert hasAttendanceDetails : "Missing attendance details in the report!";
    }

    // Scenario: Generate reports on client progress
    @When("I select {string} report")
    public void whenISelectClientProgressReport(String reportType) {
        app.selectReportType(reportType);
    }

    @When("I specify a client or a program")
    public void whenISpecifyClientOrProgram() {
        app.selectClient("John Doe");
    }

    @Then("I should see a detailed progress report for the selected client or program")
    public void thenIShouldSeeProgressReport() {
        boolean isProgressReportGenerated = app.verifyReport("Client Progress Report");
        assert isProgressReportGenerated : "Client progress report was not generated!";
    }

    @Then("the report should include milestones, completion rates, and feedback summaries")
    public void thenProgressReportIncludesDetails() {
        boolean hasProgressDetails = app.verifyClientProgressDetails();
        assert hasProgressDetails : "Missing progress details in the report!";
    }

    // Scenario: Track active programs
    @When("I navigate to the {string} page")
    public void whenINavigateToProgramTrackingPage(String page) {
        app.navigateToPage(page);
    }

    @When("I select {string}")
    public void whenISelectActivePrograms(String option) {
        app.selectOption(option);
    }

    @Then("I should see a list of all active programs")
    public void thenIShouldSeeActivePrograms() {
        boolean hasActivePrograms = app.verifyActivePrograms();
        assert hasActivePrograms : "Active programs are not displayed!";
    }

    @Then("the data should include program names, start dates, end dates, and enrollment numbers")
    public void thenActiveProgramsHaveRequiredData() {
        boolean hasProgramData = app.verifyActiveProgramData();
        assert hasProgramData : "Missing details in active programs!";
    }

    // Scenario: Track completed programs
    @When("I select {string} programs")
    public void whenISelectCompletedPrograms(String option) {
        app.selectOption(option);
    }

    @Then("I should see a list of all completed programs")
    public void thenIShouldSeeCompletedPrograms() {
        boolean hasCompletedPrograms = app.verifyCompletedPrograms();
        assert hasCompletedPrograms : "Completed programs are not displayed!";
    }

    @Then("the data should include program names, completion rates, and client feedback")
    public void thenCompletedProgramsHaveRequiredData() {
        boolean hasCompletedProgramData = app.verifyCompletedProgramData();
        assert hasCompletedProgramData : "Missing details in completed programs!";
    }

    // Scenario: Export reports
    @When("I click {string} and select a file format")
    public void whenIClickExportAndSelectFormat(String button) {
        app.clickButton(button);
        app.selectFileFormat("PDF");
    }

    @Then("the report should be downloaded in the selected format")
    public void thenReportIsDownloadedInSelectedFormat() {
        boolean isReportDownloaded = app.verifyReportDownload("PDF");
        assert isReportDownloaded : "Report was not downloaded in the selected format!";
    }

    @Then("it should contain all the relevant details")
    public void thenReportContainsRelevantDetails() {
        boolean hasReportDetails = app.verifyDownloadedReportDetails();
        assert hasReportDetails : "The downloaded report is missing relevant details!";
    }
    
}
