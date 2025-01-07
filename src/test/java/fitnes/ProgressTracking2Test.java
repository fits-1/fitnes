package fitnes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ProgressTracking2Test {

    MyApplication app;

    public ProgressTracking2Test() {
        app = new MyApplication(); // إنشاء كائن من MyApplication
    }

    // Scenario: Instructor monitors client progress
    @Given("the instructor is viewing client progress statistics")
    public void givenInstructorViewingClientProgress() {
        app.viewClientProgressStatistics(); // عرض إحصائيات تقدم العميل
    }

    @When("the instructor checks a client's completion rate and attendance")
    public void whenInstructorChecksCompletionAndAttendance() {
        app.checkClientProgress(null); // تحقق من معدل إتمام العميل وحضور الجلسات
    }

    @Then("the system should display accurate progress data")
    public void thenSystemDisplaysAccurateProgressData() {
        boolean isDataAccurate = app.verifyClientProgressData(null); // تحقق من أن البيانات دقيقة
        assert isDataAccurate : "Client progress data is not accurate!";
    }

    // Scenario: Instructor sends motivational reminders
    @Given("a client has missed two consecutive sessions")
    public void givenClientMissedTwoConsecutiveSessions() {
        app.recordMissedSessions(null, 2); // تسجيل الجلسات المفقودة
    }

    @When("the system triggers a motivational reminder")
    public void whenSystemTriggersMotivationalReminder() {
        app.triggerMotivationalReminder(null); // تفعيل التذكير التحفيزي
    }

    @Then("the client should receive a message to resume participation")
    public void thenClientReceivesMotivationalMessage() {
        boolean receivedMessage = app.verifyMotivationalMessage(null); // تحقق من أن العميل استلم الرسالة التحفيزية
        assert receivedMessage : "Client did not receive a motivational message!";
    }

}
