Feature: Verifying the Design and Buy Women's Clothing page
  Scenario: Design and buy Women's Clothing page verification
    Given User is in landing page
    Then Login an account
    And move on to categories button
    And move on to Women's Clothing button
    And move on to All Women's Clothing button and click
    And selects the first Women's Clothing product in the page
    And clicks on Start Designing button
    And selecting text color, outline shadow and font
    And select The oswald font And Verify
    And select The quantity And Verify
    And User verifies that cart heading is present