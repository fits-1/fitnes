
package fitnes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

import fitnes.MyApplication.FitnessProgram;
import fitnes.MyApplication.FitnessProgram1;

public class ProgramManagementSteps {

    MyApplication app;
	private FitnessProgram1 manager;
	private FitnessProgram program;

    public ProgramManagementSteps() {
        app = new MyApplication();  // Creating an instance of MyApplication
    }

    @Given("the instructor is on the program management page")
    public void givenInstructorIsOnProgramManagementPage() {
        // Code to navigate to the program management page
        app.navigateToProgramManagementPage();
    }

    @When("the instructor adds a new program with the appropriate details")
    public void whenInstructorAddsNewProgram() {
        // Code to add a new fitness program with the appropriate details
        app.addNewFitnessProgram("30-Day Weight Loss Challenge", "30 days", "Beginner to Intermediate", 50);
    }

    @When("the instructor uploads video tutorials and sets program goals")
    public void whenInstructorUploadsVideosAndSetsGoals() {
        // Code to upload video tutorials and set the program goals
        app.uploadProgramVideos("tutorial1.mp4", "tutorial2.mp4");
        app.setProgramGoals("Lose 5 kg", "Improve cardiovascular health");
    }

    @Then("the system should save the new fitness program successfully")
    public void thenSystemSavesNewProgram() {
        // Code to verify the system saved the new program
        boolean isProgramSaved = app.isProgramSaved("30-Day Weight Loss Challenge");
        assert isProgramSaved : "The program was not saved successfully!";
    }

    @Given("the instructor is on the program management page")
    public void givenInstructorIsOnProgramManagementPageAgain() {
        // Ensure the instructor is on the program management page again
        app.navigateToProgramManagementPage();
    }

    @When("the instructor selects an existing program to update")
    public void whenInstructorSelectsExistingProgramToUpdate() {
        // Code to select an existing program to update
        app.selectExistingProgram("30-Day Weight Loss Challenge");
    }

    @When("the instructor modifies the details of the program")
    public void whenInstructorModifiesProgramDetails() {
        // Code to modify the details of the existing program
        app.updateProgramDetails("30-Day Weight Loss Challenge", "35 days", "Intermediate", 55);
    }

    @Then("the system should save the updated fitness program successfully")
    public void thenSystemSavesUpdatedProgram() {
        // Code to verify the system saved the updated program
        boolean isProgramUpdated = app.isProgramUpdated("30-Day Weight Loss Challenge");
        assert isProgramUpdated : "The program was not updated successfully!";
    }
  
        @Given("I am logged in as a fitness program manager")
        public void iAmLoggedInAsAFitnessProgramManager() {
            // Code to log in as a fitness program manager
            manager = new FitnessProgram1();
        }

      

        @When("I upload a video tutorial and add an image for the program")
        public void iUploadAVideoTutorialAndAddAnImageForTheProgram() {
            program.addVideo("tutorial_video.mp4");
            program.addImage("program_image.jpg");
        }

        @When("I set the price to {string}")
        public void iSetThePriceTo(String price) {
            program.setPrice(price);
        }

        @When("I schedule an online group session on {string} at {string}")
        public void iScheduleAnOnlineGroupSession(String date, String time) {
            program.scheduleSession("online", date, time);
        }

        @Then("the program {string} should be created successfully")
        public void theProgramShouldBeCreatedSuccessfully(String title) {
            assertNotNull(manager.getProgramByTitle(title));
        }

        @Then("I should see the program details including title, duration, difficulty, goals, resources, price, and group session schedule")
        public void iShouldSeeTheProgramDetails() {
            assertEquals("Beginner Yoga", program.getTitle());
            assertEquals("4 weeks", program.getDuration());
            assertEquals("Beginner", program.getDifficulty());
            assertEquals("Improve flexibility", program.getGoal());
            assertNotNull(program.getVideo());
            assertNotNull(program.getImage());
            assertEquals("$50", program.getPrice());
            assertTrue(program.isScheduled());
        }

        @Given("I have an existing fitness program with the title {string}")
        public void iHaveAnExistingFitnessProgram(String title) {
            program = manager.getProgramByTitle(title);
        }

        @When("I update the program title to {string}")
        public void iUpdateTheProgramTitleTo(String newTitle) {
            program.setTitle(newTitle);
        }

        @When("I change the price to {string}")
        public void iChangeThePriceTo(String newPrice) {
            program.setPrice(newPrice);
        }

        @When("I upload an additional document for the program")
        public void iUploadAnAdditionalDocumentForTheProgram() {
            program.addDocument("additional_document.pdf", null);
        }

        @Then("the program {string} should be updated successfully")
        public void theProgramShouldBeUpdatedSuccessfully(String title) {
            assertEquals(title, program.getTitle());
        }

        @Then("I should see the updated program details including the new title, price, and added document")
        public void iShouldSeeTheUpdatedProgramDetails() {
            assertEquals("$70", program.getPrice());
            assertNotNull(program.getDocument("additional_document.pdf"));
        }

        @When("I delete the program {string}")
        public void iDeleteTheProgram(String title) {
            manager.deleteProgram(title);
        }

        @Then("the program {string} should be deleted successfully")
        public void theProgramShouldBeDeletedSuccessfully(String title) {
            assertNull(manager.getProgramByTitle(title));
        }

        @Then("I should no longer see the program in the program list")
        public void iShouldNoLongerSeeTheProgramInTheProgramList() {
            assertFalse(manager.programExists("Cardio Blast"));
        }

    
    }


