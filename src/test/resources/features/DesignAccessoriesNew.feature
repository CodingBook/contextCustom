Feature: Verifying the Design and Buy page

  Scenario: Design and buy page verification
    Given user is in landing page and signs in
    When user lands on all accessories and verifies
    And user clicks the first product in the page
    And user sets the design features
    Then User selects the product quantity and verifies


