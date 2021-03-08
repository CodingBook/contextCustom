Feature: Verifying the Design and Buy Kids and Youth Clothing page

  Scenario: Design and buy Kids and Youth Clothing page verification
    Given user is in landing page and signs in
    When user lands on all Kids and Youth Clothing and verifies
    And selects the first Kids and Youth Clothing product in the page
    And user sets the design features
    Then User selects the product quantity and verifies
