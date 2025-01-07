package fitnes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;



public class FeedbackandReviews {

    private MyApplication app;
    private int userRating;
    private String userReview;
    private String improvementSuggestion;

    public void FeedbackandReviewstest() {
        app = new MyApplication();
    }

    // Scenario 1: Rating and reviewing a completed program
  

    @When("the user rates the program with a score")
    public void whenTheUserRatesTheProgramWithAScore() {
        // Rate the program
        userRating = app.submitRating(5);  // Example: rating with score 5
    }

    @When("the user submits a review for the program")
    public void whenTheUserSubmitsAReviewForTheProgram() {
        // Submit the review
        userReview = app.submitReview("Great program, very effective!");
    }

    @Then("the program should display the user's rating and review")
    public void thenTheProgramShouldDisplayTheUserSRatingAndReview() {
        assertEquals(5, userRating);
        assertEquals("Great program, very effective!", userReview);
        assertTrue(app.isReviewVisible(userRating, userReview));
    }

    // Scenario 2: Submitting improvement suggestions to the instructor
    @Given("the user has completed a fitness program")
    public void givenTheUserHasCompletedAFitnessProgramForSuggestion() {
        // Ensure the user has completed the program (similar to the previous scenario)
        app.completeFitnessProgram(improvementSuggestion);
    }

    @When("the user submits an improvement suggestion to the instructor")
    public void whenTheUserSubmitsAnImprovementSuggestionToTheInstructor() {
        // Submit an improvement suggestion to the instructor
        improvementSuggestion = app.submitImprovementSuggestion("Could include more cardio exercises.");
    }

    @Then("the instructor should receive the user's suggestion")
    public void thenTheInstructorShouldReceiveTheUserSSuggestion() {
        assertTrue(app.isInstructorNotifiedOfSuggestion(improvementSuggestion));
    }

    @Then("the suggestion should be recorded in the system")
    public void thenTheSuggestionShouldBeRecordedInTheSystem() {
        assertTrue(app.isSuggestionRecorded(improvementSuggestion));
    }
    
}
