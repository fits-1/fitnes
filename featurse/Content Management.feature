Feature: Content and Feedback Management
  Scenario: Approve a wellness article, tip, or recipe shared by an instructor
    Given I am logged in as an admin
    And there are pending submissions from instructors
    When I navigate to the "Content Approval" page
    And I review a submitted wellness article, tip, or recipe
    And I click "Approve"
    Then the content should be approved
    And it should be published on the platform
    And the instructor should receive a notification of the approval.

  Scenario: Reject a wellness article, tip, or recipe shared by an instructor
    Given I am logged in as an admin
    And there are pending submissions from instructors
    When I navigate to the "Content Approval" page
    And I review a submitted wellness article, tip, or recipe
    And I click "Reject"
    Then the content should be rejected
    And the instructor should receive a notification with the reason for rejection.

  Scenario: Approve articles or tips on health and wellness
    Given I am logged in as an admin
    And there are pending health and wellness articles or tips for review
    When I navigate to the "Content Approval" page
    And I review a submitted health or wellness article or tip
    And I click "Approve"
    Then the content should be approved
    And it should be visible to users in the appropriate section.

  Scenario: Reject articles or tips on health and wellness
    Given I am logged in as an admin
    And there are pending health and wellness articles or tips for review
    When I navigate to the "Content Approval" page
    And I review a submitted health or wellness article or tip
    And I click "Reject"
    Then the content should be rejected
    And the submitter should be notified with a rejection reason.

  Scenario: Handle user feedback
    Given I am logged in as an admin
    And there are user feedback submissions
    When I navigate to the "User Feedback" page
    And I open a specific feedback entry
    Then I should be able to read the feedback
    And I should see options to "Mark as Resolved" or "Respond."

  Scenario: Handle user complaints
    Given I am logged in as an admin
    And there are user complaint submissions
    When I navigate to the "User Complaints" page
    And I open a specific complaint entry
    Then I should be able to review the details of the complaint
    And I should see options to "Assign to a Support Team" or "Close Complaint."

