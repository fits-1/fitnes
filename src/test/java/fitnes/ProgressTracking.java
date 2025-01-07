package fitnes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ProgressTracking {

    MyApplication app;

    public ProgressTracking() {
        app = new MyApplication(); // إنشاء كائن من MyApplication
    }

    // Scenario: Tracking personal fitness milestones
    @Given("the user is on the fitness tracking page")
    public void givenUserOnFitnessTrackingPage() {
        app.navigateToFitnessTrackingPage(); // انتقل إلى صفحة تتبع اللياقة البدنية
    }

    @When("the user enters their current weight")
    public void whenUserEntersWeight() {
        app.enterWeight(null, 70); // على سبيل المثال، 70 كجم
    }

    @When("the user enters their current BMI")
    public void whenUserEntersBMI() {
        app.enterBMI(null, 23.5); // على سبيل المثال، 23.5
    }

    @When("the user logs their attendance for a fitness program")
    public void whenUserLogsAttendance() {
        app.logProgramAttendance(null, null); // تسجيل الحضور في برنامج لياقة بدنية
    }

    @Then("the fitness milestones should be updated with the entered weight, BMI, and attendance")
    public void thenMilestonesShouldBeUpdated() {
        boolean isUpdated = app.verifyMilestonesUpdated(null); // تحقق من أن المعالم قد تم تحديثها
        assert isUpdated : "Fitness milestones were not updated correctly!";
    }

    // Scenario: Viewing achievements or badges after completing a program
    @Given("the user has completed a fitness program")
    public void givenUserHasCompletedProgram() {
        app.completeFitnessProgram(null); // إتمام البرنامج التدريبي
    }

    @When("the user views their achievements")
    public void whenUserViewsAchievements() {
        app.viewAchievements(null); // عرض الإنجازات
    }

    @Then("the user should see badges or achievements for completing the program")
    public void thenUserShouldSeeBadges() {
        boolean hasBadges = app.verifyBadges(null); // تحقق من وجود الشارات
        assert hasBadges : "User did not receive badges for completing the program!";
    }

    @Then("the badges or achievements should reflect the completed milestones")
    public void thenBadgesReflectCompletedMilestones() {
        boolean areBadgesCorrect = app.verifyBadgesReflectMilestones(null); // تحقق من أن الشارات تعكس المعالم المكتملة
        assert areBadgesCorrect : "Badges do not reflect completed milestones!";
    }
    
}
