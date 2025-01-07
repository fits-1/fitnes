Feature: Analytics and Reporting for Programs and Revenue


  Scenario: View statistics on the most popular programs by enrollment
    Given I am logged in as an admin
    When I navigate to the "Analytics Dashboard"
    And I select "Program Popularity" from the options
    Then I should see a list of programs sorted by enrollment numbers
    And the data should include program names, total enrollments, and trends over time.

  Scenario: Generate reports on revenue
    Given I am logged in as an admin
    When I navigate to the "Reports" section
    And I select "Revenue Report"
    And I specify a date range
    And I click "Generate Report"
    Then I should see a detailed revenue report for the selected period
    And the report should include total revenue, revenue by program, and payment methods.

  Scenario: Generate reports on attendance
    Given I am logged in as an admin
    When I navigate to the "Reports" section
    And I select "Attendance Report"
    And I specify a date range and a program
    And I click "Generate Report"
    Then I should see a detailed attendance report for the selected program and period
    And the report should include attendance percentages and trends.

  Scenario: Generate reports on client progress
    Given I am logged in as an admin
    When I navigate to the "Reports" section
    And I select "Client Progress Report"
    And I specify a client or a program
    And I click "Generate Report"
    Then I should see a detailed progress report for the selected client or program
    And the report should include milestones, completion rates, and feedback summaries.

  Scenario: Track active programs
    Given I am logged in as an admin
    When I navigate to the "Program Tracking" page
    And I select "Active Programs"
    Then I should see a list of all active programs
    And the data should include program names, start dates, end dates, and enrollment numbers.

  Scenario: Track completed programs
    Given I am logged in as an admin
    When I navigate to the "Program Tracking" page
    And I select "Completed Programs"
    Then I should see a list of all completed programs
    And the data should include program names, completion rates, and client feedback.

  Scenario: Export reports
    Given I have generated a report
    When I click "Export"
    And I select a file format (e.g., PDF, CSV)
    Then the report should be downloaded in the selected format
    And it should contain all the relevant details.

