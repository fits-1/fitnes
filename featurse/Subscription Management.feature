Feature: User Management and Monitoring

  Scenario: Admin adds a new account
    Given the admin is logged in
    When the admin adds a new account
    Then the system should save the account

  Scenario: Admin updates an account
    Given the admin is logged in
    When the admin updates an account
    Then the account should be updated

  Scenario: Admin deactivates an account
    Given the admin is logged in
    When the admin deactivates an account
    Then the account should be deactivated

  Scenario: Admin approves an instructor registration
    Given the admin is logged in
    When the admin approves an instructor registration
    Then the registration should be approved

  Scenario: Admin monitors user activity
    Given the admin is logged in
    When the admin requests user activity statistics
    Then the system should display user activity statistics
