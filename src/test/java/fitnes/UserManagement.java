package fitnes;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class UserManagement {

    MyApplication app;

    public UserManagement() {
        app = new MyApplication<Object>(); // Initialize the MyApplication class
    }

    // Scenario: Add a new instructor or client account
    @Given("I am logged in as an admin")
    public void givenIAmLoggedInAsAdmin() {
        app.adminLogin(); // Simulate admin login
    }

    @When("I navigate to the {string} page")
    public void whenINavigateToPage(String page) {
        app.navigateToPage(page); // Navigate to the specified page
    }

    @When("I click {string}")
    public void whenIClick(String button) {
        app.clickButton(button); // Simulate clicking a button
    }

    @When("I fill out the required details for the new account")
    public void whenIFillOutDetailsForNewAccount() {
        app.fillAccountDetails(); // Simulate filling out account details
    }

    @When("I select the role as {string}")
    public void whenISelectRole(String role) {
        app.selectRole(role); // Simulate selecting a role
    }

    @When("I click Save")
    public void whenIClickSave() {
        app.clickSave(); // Simulate clicking the save button
    }

    @Then("the new account should be added successfully")
    public void thenNewAccountShouldBeAddedSuccessfully1() {
        boolean isAccountAdded = app.isAccountAdded(); // Check if the account was added successfully
        assert isAccountAdded : "Account was not added successfully!";
    }

    @Then("I should see a confirmation message")
    public void thenIShouldSeeConfirmationMessage() {
        boolean isConfirmationMessageDisplayed = app.isConfirmationMessageDisplayed(); // Check for confirmation message
        assert isConfirmationMessageDisplayed : "Confirmation message was not displayed!";
    }

    // Scenario: Update an instructor or client account
    @When("I search for an existing account")
    public void whenISearchForExistingAccount() {
        app.searchForAccount(); // Simulate searching for an existing account
    }

    @When("I update the account details")
    public void whenIUpdateAccountDetails() {
        app.updateAccountDetails(); // Simulate updating the account details
    }

    @Then("the account details should be updated successfully")
    public void thenAccountDetailsShouldBeUpdatedSuccessfully() {
        boolean isAccountUpdated = app.isAccountUpdated(); // Check if the account was updated
        assert isAccountUpdated : "Account was not updated successfully!";
    }

    // Scenario: Deactivate an instructor or client account
    @When("I deactivate the account")
    public void whenIDeactivateAccount() {
        app.deactivateAccount(); // Simulate deactivating an account
    }

    @Then("the account should be deactivated successfully")
    public void thenAccountShouldBeDeactivatedSuccessfully() {
        boolean isAccountDeactivated = app.isAccountDeactivated(); // Check if the account was deactivated
        assert isAccountDeactivated : "Account was not deactivated successfully!";
    }

    // Scenario: Monitor user activity and engagement statistics
    @When("I apply a filter {string} with value {string}")
    public void whenIApplyFilter(String filter, String value) {
        app.applyFilter(filter, value); // Apply the filter for user activity
    }

    @Then("I should see user activity data displayed")
    public void thenIShouldSeeUserActivityData() {
        boolean isActivityDataDisplayed = app.isUserActivityDataDisplayed(); // Check if activity data is displayed
        assert isActivityDataDisplayed : "User activity data was not displayed!";
    }

    // Scenario: Add a new instructor or client account with details
    @When("I add a new account with the name {string}, email {string}, and role {string}")
    public void whenIAddNewAccountWithDetails(String name, String email, String role) {
        app.addNewAccountWithDetails(name, email, role); // Simulate adding a new account with specific details
    }

    @Then("the new account should be added successfully")
    public void thenNewAccountShouldBeAddedSuccessfully() {
        boolean isAccountAdded = app.isAccountAdded(); // Check if the account was added successfully
        assert isAccountAdded : "Account was not added successfully!";
    }
    
}
