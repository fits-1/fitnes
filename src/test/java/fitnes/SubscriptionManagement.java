package fitnes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SubscriptionManagement {

    MyApplication app;

    public SubscriptionManagement() {
        app = new MyApplication(); // Initialize the MyApplication class
    }

    // Scenario: Admin adds a new account
    @Given("the admin is logged in")
    public void givenAdminIsLoggedIn() {
        app.adminLogin();
    }

    @When("the admin adds a new account")
    public void whenAdminAddsNewAccount() {
        app.addNewAccount(null); // Simulate adding a new account
    }

    @Then("the system should save the account")
    public void thenSystemSavesAccount() {
        boolean isAccountSaved = app.isAccountSaved(null); // Check if the account is saved
        assert isAccountSaved : "Account was not saved successfully!";
    }

    // Scenario: Admin updates an account
    @When("the admin updates an account")
    public void whenAdminUpdatesAccount() {
        app.updateAccount(null, null); // Simulate updating an account
    }

    @Then("the account should be updated")
    public void thenAccountShouldBeUpdated() {
        boolean isAccountUpdated = app.isAccountUpdated(); // Check if the account is updated
        assert isAccountUpdated : "Account was not updated successfully!";
    }

    // Scenario: Admin deactivates an account
    @When("the admin deactivates an account")
    public void whenAdminDeactivatesAccount() {
        app.deactivateAccount(); // Simulate deactivating an account
    }

    @Then("the account should be deactivated")
    public void thenAccountShouldBeDeactivated() {
        boolean isAccountDeactivated = app.isAccountDeactivated(); // Check if the account is deactivated
        assert isAccountDeactivated : "Account was not deactivated successfully!";
    }

    // Scenario: Admin approves an instructor registration
    @When("the admin approves an instructor registration")
    public void whenAdminApprovesInstructorRegistration() {
        app.approveInstructorRegistration(null); // Simulate approving instructor registration
    }

    @Then("the registration should be approved")
    public void thenInstructorRegistrationShouldBeApproved() {
        boolean isRegistrationApproved = app.isInstructorRegistrationApproved(null); // Check if the registration is approved
        assert isRegistrationApproved : "Instructor registration was not approved!";
    }

    // Scenario: Admin monitors user activity
    @When("the admin requests user activity statistics")
    public void whenAdminRequestsUserActivityStatistics() {
        app.requestUserActivityStatistics(null); // Simulate requesting user activity statistics
    }

    @Then("the system should display user activity statistics")
    public void thenSystemDisplaysUserActivityStatistics() {
        boolean areStatsDisplayed = app.areUserActivityStatsDisplayed(null); // Check if user activity stats are displayed
        assert areStatsDisplayed : "User activity statistics were not displayed!";
    }
    
}
