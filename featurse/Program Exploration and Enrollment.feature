Feature: Browsing Programs by Filters

  Scenario: Browsing programs by difficulty level and focus area
    Given the user is on the program browsing page
    When the user filters programs by difficulty level
    And the user filters programs by focus area
    Then the program list should display programs with the selected difficulty level and focus area

  Scenario: Enrolling in a program
    Given the user is on the program browsing page
    And the user has filtered programs by difficulty level
    And the user has filtered programs by focus area
    When the user selects a program
    And the user clicks on the "Enroll" button
    Then the user should be enrolled in the selected program
    And the program details should show "Enrolled"

  Scenario: Viewing program schedule after enrolling
    Given the user has successfully enrolled in a program
    When the user clicks on "View Schedule" for the enrolled program
    Then the program schedule should be displayed
    And the schedule should show the days and times for the program sessions

  Scenario: Filtering programs by multiple criteria
    Given the user is on the program browsing page
    When the user filters programs by difficulty level
    And the user filters programs by focus area
    Then the program list should display programs that match both the selected difficulty level and focus area

  Scenario: Handling no results after applying filters
    Given the user is on the program browsing page
    When the user filters programs by difficulty level
    And the user filters programs by focus area
    Then a message should appear saying "No programs found for selected filters"
