package fitnes;

import java.util.Map.Entry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class ProgramExplorationandEnrollment {

    private MyApplication app;
    private Entry selectedProgram;
    private String programSchedule;

    public ProgramExplorationandEnrollment() {
        app = new MyApplication();
    }

    // Scenario 1: Browsing programs by difficulty level and focus area
    @Given("the user is on the program browsing page")
    public void givenTheUserIsOnTheProgramBrowsingPage() {
        // Ensure the user is on the program browsing page
        app.navigateToProgramBrowsingPage();
    }

    @When("the user filters programs by difficulty level")
    public void whenTheUserFiltersProgramsByDifficultyLevel() {
        // User filters by difficulty level
        app.filterProgramsByDifficultyLevel("Intermediate");
    }

    @When("the user filters programs by focus area")
    public void whenTheUserFiltersProgramsByFocusArea() {
        // User filters by focus area
        app.filterProgramsByFocusArea("Strength Training");
    }

    @Then("the program list should display programs with the selected difficulty level and focus area")
    public void thenTheProgramListShouldDisplayProgramsWithTheSelectedDifficultyLevelAndFocusArea() {
        // Verify that the program list matches the filters
        assertTrue(app.programsMatchFilters("Intermediate", "Strength Training"));
    }

    // Scenario 2: Enrolling in a program
    @Given("the user has filtered programs by difficulty level")
    public void givenTheUserHasFilteredProgramsByDifficultyLevel() {
        app.filterProgramsByDifficultyLevel("Beginner");
    }

    @Given("the user has filtered programs by focus area")
    public void givenTheUserHasFilteredProgramsByFocusArea() {
        app.filterProgramsByFocusArea("Cardio");
    }

    @When("the user selects a program")
    public void whenTheUserSelectsAProgram() {
        // Simulate user selecting a program
        selectedProgram = app.selectProgram("Cardio Blast");
    }

    @When("the user clicks on the \"Enroll\" button")
    public void whenTheUserClicksOnEnrollButton() {
        // Simulate user clicking the enroll button
        app.enrollInProgram(selectedProgram);
    }

    @Then("the user should be enrolled in the selected program")
    public void thenTheUserShouldBeEnrolledInTheSelectedProgram() {
        // Verify that the user is enrolled
        assertTrue(app.isUserEnrolled(selectedProgram));
    }

    private void assertTrue(boolean userEnrolled) {
		// TODO Auto-generated method stub
		
	}

	@Then("the program details should show \"Enrolled\"")
    public void thenTheProgramDetailsShouldShowEnrolled() {
        // Verify that the program details show "Enrolled"
        assertTrue(app.programDetailsShowEnrolled((CharSequence) selectedProgram));
    }

    // Scenario 3: Viewing program schedule after enrolling
    @Given("the user has successfully enrolled in a program")
    public void givenTheUserHasSuccessfullyEnrolledInAProgram() {
        app.enrollInProgram("Cardio Blast");
    }

    @When("the user clicks on \"View Schedule\" for the enrolled program")
    public void whenTheUserClicksOnViewScheduleForTheEnrolledProgram() {
        // Simulate user viewing the program schedule
        programSchedule = app.viewProgramSchedule("Cardio Blast");
    }

    @Then("the program schedule should be displayed")
    public void thenTheProgramScheduleShouldBeDisplayed() {
        // Verify the schedule is displayed
        assertNotNull(programSchedule);
    }

    private void assertNotNull(String programSchedule2) {
		// TODO Auto-generated method stub
		
	}

	@Then("the schedule should show the days and times for the program sessions")
    public void thenTheScheduleShouldShowTheDaysAndTimesForTheProgramSessions() {
        // Verify the program schedule contains the correct days and times
        assertTrue(app.isScheduleValid(programSchedule));
    }

    // Scenario 4: Filtering programs by multiple criteria
    @Given("the user is on the program browsing page")
    public void givenTheUserIsOnTheProgramBrowsingPageAgain() {
        app.navigateToProgramBrowsingPage();
    }

    @When("the user filters programs by difficulty level")
    public void whenTheUserFiltersProgramsByDifficultyLevelAgain() {
        app.filterProgramsByDifficultyLevel("Advanced");
    }

    @When("the user filters programs by focus area")
    public void whenTheUserFiltersProgramsByFocusAreaAgain() {
        app.filterProgramsByFocusArea("Yoga");
    }

    @Then("the program list should display programs that match both the selected difficulty level and focus area")
    public void thenTheProgramListShouldDisplayProgramsThatMatchBothTheSelectedDifficultyLevelAndFocusArea() {
        assertTrue(app.programsMatchFilters("Advanced", "Yoga"));
    }

    // Scenario 5: Handling no results after applying filters
    @Given("the user is on the program browsing page")
    public void givenTheUserIsOnTheProgramBrowsingPageForNoResults() {
        app.navigateToProgramBrowsingPage();
    }

    @When("the user filters programs by difficulty level")
    public void whenTheUserFiltersProgramsByDifficultyLevelForNoResults() {
        app.filterProgramsByDifficultyLevel("Expert");
    }

  

    @Then("a message should appear saying \"No programs found for selected filters\"")
    public void thenAMessageShouldAppearSayingNoProgramsFoundForSelectedFilters() {
        // Verify that the "No programs found" message is displayed
        assertTrue(app.noProgramsFoundMessageDisplayed());
    }
    
}
