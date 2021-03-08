Feature: Verifying the Design and Buy Women's Clothing page
  Scenario: Design and buy Women's Clothing page verification
    Given user is in landing page and signs in
    When user lands on all Women's Clothing and verifies
    And selects the first Women's Clothing product in the page
    And user sets the design features
    Then User selects the product quantity and verifies
