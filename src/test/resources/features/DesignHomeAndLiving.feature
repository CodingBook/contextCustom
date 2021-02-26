Feature: Verifying the Design and Buy Home and Living page

  Scenario: Design and buy Home and Living page verification
    Given User is in landing page
    Then Login an account
    And move on to categories button
    And move on to Home and Living button
    And move on to All Home and Living button and click
    And selects the first Home and Living product in the page
    And clicks on Start Designing button
    And selecting text color, outline shadow and font
    And select The oswald font And Verify
    And select The quantity And Verify
    And User verifies that cart heading is present
