Feature: Notifications and Updates

  Scenario: Instructor notifies clients about schedule changes
    Given the instructor needs to reschedule a session
    When the instructor updates the session to Wednesday at 6 PM
    Then all participants should be notified of the change

  Scenario: Instructor announces a new fitness program
    Given the instructor has launched a new program titled "HIIT 6-Week Challenge"
    When the instructor sends an announcement to all clients
    Then clients should receive the program details and subscription link
