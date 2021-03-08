Feature: Verifying the Design and Buy Mens Clothing page
  Scenario: Design and buy Mens Clothing page verification
    Given user is in landing page and signs in
    When user lands on all Mens Clothing and verifies
    And selects the first Mens Clothing product in the page
    And user sets the design features
    Then User selects the product quantity and verifies
