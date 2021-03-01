Feature:Hats Page Functionality

 @Hats
  Scenario:Verifying Hats Page
    Given User is in landing page and sign in
    When user lands on All Hats page and verifies
    And user verifies that first Hats product features are present
    Then user clicks on first Hats product and verifies