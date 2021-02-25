Feature: Verifying the Design and Buy Mens Clothing page
  Scenario: Design and buy Mens Clothing page verification
    Given User is in landing page
    Then Login an account
    And move on to categories button
    And move on to Mens Clothing button
    And move on to All Mens Clothing button and click
    And selects the first Mens Clothing product in the page
    And clicks on Start Designing button
    And selecting text color, outline shadow and font
    And select The oswald font And Verify
    And select The quantity And Verify
    And User verifies that cart heading is present