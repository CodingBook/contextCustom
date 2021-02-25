Feature:Accessories Page Functionality

  @Accessories
  Scenario:Navigating and Verifying Accessories Page
    When move on to Categories dropdown menu for Accessories
    When move on to Accessories
    Then move on to All Accessories and click
    And verify  Accessories text is present

    Then verify ToteBag image is present
    And verify  ToteBag item brand name is present
#    Then verify ToteBag item text is present
    And verify ToteBag item price is present
    And click on ToteBag item picture
#    Then verify ToteBag item name is present