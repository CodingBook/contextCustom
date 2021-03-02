Feature: Verifying New Products

  Scenario: New Products Verification

    Given User verifies the landing page
    When User verifies that product images are displayed
    And  User verifies that product names are present
    And  User verifies that product prices are present
    And  User verifies that brand names are present
    And  User verifies that design&buy buttons are present
    Then User clicks on More Products button and verifies the page
