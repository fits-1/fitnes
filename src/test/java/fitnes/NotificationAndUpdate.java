package fitnes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;



public class NotificationAndUpdate {

    private MyApplication app;
    private String sessionUpdateDetails;
    private String programAnnouncementDetails;

    public NotificationAndUpdate() {
        app = new MyApplication();
    }

    // Scenario 1: Instructor notifies clients about schedule changes
    @Given("the instructor needs to reschedule a session")
    public void givenTheInstructorNeedsToRescheduleASession() {
        // Ensure that the instructor needs to reschedule a session
        app.instructorNeedsToRescheduleSession(programAnnouncementDetails);
    }

    @When("the instructor updates the session to Wednesday at 6 PM")
    public void whenTheInstructorUpdatesTheSessionToWednesdayAt6PM() {
        // Instructor updates the session to a new time
        sessionUpdateDetails = app.updateSessionSchedule("Wednesday", "6 PM");
    }

    @Then("all participants should be notified of the change")
    public void thenAllParticipantsShouldBeNotifiedOfTheChange() {
        // Verify that all participants are notified
        assertTrue(app.areParticipantsNotified(sessionUpdateDetails));
    }

    // Scenario 2: Instructor announces a new fitness program
    @Given("the instructor has launched a new program titled {string}")
    public void givenTheInstructorHasLaunchedANewProgramTitled(String programTitle) {
        // Ensure the instructor has launched a new fitness program
        app.launchNewProgram(programTitle);
    }

    @When("the instructor sends an announcement to all clients")
    public void whenTheInstructorSendsAnAnnouncementToAllClients() {
        // Instructor sends an announcement
        programAnnouncementDetails = app.sendProgramAnnouncement("HIIT 6-Week Challenge");
    }

    @Then("clients should receive the program details and subscription link")
    public void thenClientsShouldReceiveTheProgramDetailsAndSubscriptionLink() {
        // Verify that clients receive the announcement and subscription link
        assertTrue(app.areClientsNotifiedOfProgram(programAnnouncementDetails));
    }
    
}
