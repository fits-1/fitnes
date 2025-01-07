Feature: Manage Fitness Programs

  As a fitness program manager
  I want to create, update, delete, and view fitness programs
  So that I can efficiently manage available fitness programs for users

  # Scenario 1: Create a New Fitness Program
  Scenario: Create a new fitness program
    Given I am logged in as a fitness program manager
    When I create a new fitness program with the title "Beginner Yoga", duration "4 weeks", difficulty "Beginner", and goal "Improve flexibility"
    And I upload a video tutorial and add an image for the program
    And I set the price to "$50"
    And I schedule an online group session on "2025-01-10 at 6:00 PM"
    Then the program "Beginner Yoga" should be created successfully
    And I should see the program details including title, duration, difficulty, goals, resources, price, and group session schedule

  # Scenario 2: Update an Existing Fitness Program
  Scenario: Update an existing fitness program
    Given I have an existing fitness program with the title "Advanced Pilates"
    When I update the program title to "Advanced Pilates for Flexibility"
    And I change the price to "$70"
    And I upload an additional document for the program
    Then the program "Advanced Pilates for Flexibility" should be updated successfully
    And I should see the updated program details including the new title, price, and added document

  # Scenario 3: Delete a Fitness Program
  Scenario: Delete a fitness program
    Given I have an existing fitness program titled "Cardio Blast"
    When I delete the program "Cardio Blast"
    Then the program "Cardio Blast" should be deleted successfully
    And I should no longer see the program in the program list

  # Scenario 4: View Fitness Program Details
  Scenario: View details of a fitness program
    Given I have an existing fitness program titled "Strength Training"
    When I view the program "Strength Training"
    Then I should see the program details including title, duration, difficulty, goals, resources, price, and group session schedule

