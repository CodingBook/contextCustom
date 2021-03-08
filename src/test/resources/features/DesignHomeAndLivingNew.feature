Feature: Verifying the Design and Buy Home and Living page

  Scenario: Design and buy Home and Living page verification
    Given user is in landing page and signs in
    When user lands on all Home and Living and verifies
    And selects the first Home and Living product in the page
    And user sets the design features
    Then User selects the product quantity and verifies
