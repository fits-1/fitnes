Feature: Tracking Personal Fitness Milestones and Achievements

  Scenario: Tracking personal fitness milestones
    Given the user is on the fitness tracking page
    When the user enters their current weight
    And the user enters their current BMI
    And the user logs their attendance for a fitness program
    Then the fitness milestones should be updated with the entered weight, BMI, and attendance

  Scenario: Viewing achievements or badges after completing a program
    Given the user has completed a fitness program
    When the user views their achievements
    Then the user should see badges or achievements for completing the program
    And the badges or achievements should reflect the completed milestones
