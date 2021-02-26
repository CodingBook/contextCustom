Feature: Verifying the Design and Buy page

  Scenario: Design and buy page verification
    Given user is in landing page and signs in
    When user lands on all accessories and verifies
#    Then move on to categories button
#    And move on to accessories button
#    And move on to All accessories button and click
    And user clicks the first product in the page
    And user sets the design features
#    And clicks on Start Designing button
#    And selecting text color, outline shadow and font
#    And select The oswald font And Verify
    Then User selects the product quantity and verifies
#    And select The quantity And Verify

