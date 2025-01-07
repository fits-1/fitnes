Feature: Rating, Reviewing Completed Programs, and Submitting Suggestions

  Scenario: Rating and reviewing a completed program
    Given the user has completed a fitness program
    When the user rates the program with a score
    And the user submits a review for the program
    Then the program should display the user's rating and review

  Scenario: Submitting improvement suggestions to the instructor
    Given the user has completed a fitness program
    When the user submits an improvement suggestion to the instructor
    Then the instructor should receive the user's suggestion
    And the suggestion should be recorded in the system
