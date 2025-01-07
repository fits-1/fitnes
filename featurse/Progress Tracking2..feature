Feature: Progress Tracking

  Scenario: Instructor monitors client progress
    Given the instructor is viewing client progress statistics
    When the instructor checks a client's completion rate and attendance
    Then the system should display accurate progress data

  Scenario: Instructor sends motivational reminders
    Given a client has missed two consecutive sessions
    When the system triggers a motivational reminder
    Then the client should receive a message to resume participation
