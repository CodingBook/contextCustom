Feature: Verifying the Main Page

  Scenario: Homepage verification
    Given User is in landing page
    When Verify that Context Custom logo is present
    And Verify that "How It Works?" is present
    And Verify that "Free Mockups" is present
    Then Verify that "Buy Designs" is present
