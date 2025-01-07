package fitnes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class ContentkManagement {

    private MyApplication app;
    private String contentStatus;
    private String feedback;
    private String rejectionReason;
    private String complaintDetails;
    private boolean isContentApproved;

    public ContentkManagement() {
        app = new MyApplication();
    }

    // Scenario 1: Approve a wellness article, tip, or recipe
    @Given("I am logged in as an admin")
    public void givenIAmLoggedInAsAnAdmin() {
        // Log in as an admin (mocked behavior)
        app.loginAsAdmin(complaintDetails, complaintDetails);
    }

    @Given("there are pending submissions from instructors")
    public void givenThereArePendingSubmissionsFromInstructors() {
        // Ensure there are pending submissions from instructors
        app.addPendingSubmissions();
    }

    @When("I navigate to the \"Content Approval\" page")
    public void whenINavigateToTheContentApprovalPage() {
        // Navigate to content approval page
        app.navigateToContentApprovalPage();
    }

    @When("I review a submitted wellness article, tip, or recipe")
    public void whenIReviewASubmittedWellnessArticleTipOrRecipe() {
        // Review the submitted content
        contentStatus = app.reviewContent("Wellness Article");
    }

    @When("I click \"Approve\"")
    public void whenIClickApprove() {
        // Approve the content
        isContentApproved = app.approveContent(complaintDetails);
    }

    @Then("the content should be approved")
    public void thenTheContentShouldBeApproved() {
        assertTrue(isContentApproved);
    }

    private void assertTrue(boolean isContentApproved2) {
		// TODO Auto-generated method stub
		
	}

	@Then("it should be published on the platform")
    public void thenItShouldBePublishedOnThePlatform() {
        assertTrue(app.isContentPublished(complaintDetails));
    }

    @Then("the instructor should receive a notification of the approval")
    public void thenTheInstructorShouldReceiveANotificationOfTheApproval() {
        assertTrue(app.getInstructorNotification(complaintDetails).contains("Your content has been approved"));
    }

    // Scenario 2: Reject a wellness article, tip, or recipe
    @When("I click \"Reject\"")
    public void whenIClickReject() {
        // Reject the content
        rejectionReason = app.rejectContent(complaintDetails);
    }

    @Then("the content should be rejected")
    public void thenTheContentShouldBeRejected() {
        assertTrue(app.isContentRejected(complaintDetails));
    }

    @Then("the instructor should receive a notification with the reason for rejection")
    public void thenTheInstructorShouldReceiveANotificationWithTheReasonForRejection() {
        assertTrue(app.getInstructorNotification(complaintDetails).contains(rejectionReason));
    }

    // Scenario 3: Approve health and wellness articles or tips
    @Given("there are pending health and wellness articles or tips for review")
    public void givenThereArePendingHealthAndWellnessArticlesOrTipsForReview() {
        // Ensure there are health and wellness articles/tips for review
        app.addHealthWellnessArticlesForReview(complaintDetails);
    }

    @When("I review a submitted health or wellness article or tip")
    public void whenIReviewASubmittedHealthOrWellnessArticleOrTip() {
        // Review the submitted health/wellness content
        contentStatus = app.reviewContent("Health Tip");
    }

    @Then("the content should be visible to users in the appropriate section")
    public void thenTheContentShouldBeVisibleToUsersInTheAppropriateSection() {
        assertTrue(app.isContentVisibleToUsers(complaintDetails));
    }

    // Scenario 4: Reject health and wellness articles or tips
    @When("I click \"Reject\" on a health or wellness article or tip")
    public void whenIClickRejectOnAHealthOrWellnessArticleOrTip() {
        // Reject health/wellness content
        rejectionReason = app.rejectContent(complaintDetails);
    }

    @Then("the submitter should be notified with a rejection reason")
    public void thenTheSubmitterShouldBeNotifiedWithARejectionReason() {
        assertTrue(app.getSubmitterNotification(complaintDetails).contains(rejectionReason));
    }

    // Scenario 5: Handle user feedback
    @Given("there are user feedback submissions")
    public void givenThereAreUserFeedbackSubmissions() {
        // Ensure there are feedback submissions
        app.addUserFeedback(complaintDetails);
    }

    @When("I navigate to the \"User Feedback\" page")
    public void whenINavigateToTheUserFeedbackPage() {
        // Navigate to user feedback page
        app.navigateToUserFeedbackPage();
    }

    @When("I open a specific feedback entry")
    public void whenIOpenASpecificFeedbackEntry() {
        // Open a specific feedback entry
        feedback = app.openFeedbackEntry(1);
    }

    @Then("I should be able to read the feedback")
    public void thenIShouldBeAbleToReadTheFeedback() {
        assertNotNull(feedback);
    }

    private void assertNotNull(String feedback2) {
		// TODO Auto-generated method stub
		
	}

	@Then("I should see options to \"Mark as Resolved\" or \"Respond\"")
    public void thenIShouldSeeOptionsToMarkAsResolvedOrRespond() {
        assertTrue(app.hasFeedbackOptions());
    }

    // Scenario 6: Handle user complaints
    @Given("there are user complaint submissions")
    public void givenThereAreUserComplaintSubmissions() {
        // Ensure there are complaint submissions
        app.addUserComplaints(complaintDetails);
    }

    @When("I navigate to the \"User Complaints\" page")
    public void whenINavigateToTheUserComplaintsPage() {
        // Navigate to user complaints page
        app.navigateToUserComplaintsPage();
    }

    @When("I open a specific complaint entry")
    public void whenIOpenASpecificComplaintEntry() {
        // Open a specific complaint entry
        complaintDetails = app.openComplaintEntry(1);
    }

    @Then("I should be able to review the details of the complaint")
    public void thenIShouldBeAbleToReviewTheDetailsOfTheComplaint() {
        assertNotNull(complaintDetails);
    }

    @Then("I should see options to \"Assign to a Support Team\" or \"Close Complaint\"")
    public void thenIShouldSeeOptionsToAssignToASupportTeamOrCloseComplaint() {
        assertTrue(app.hasComplaintOptions());
    }
    
    
}
