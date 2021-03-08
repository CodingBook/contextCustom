Feature: Verifying the Design and Buy Hats page

  Scenario: Design and buy hats page verification
    Given user is in landing page and signs in
    When user lands on all hats and verifies
    And user clicks the first hat in the page
    And user sets the design features
    Then User selects the product quantity and verifies
