Feature:Hats Page Functionality

  @Kids
  Scenario:Verifying Hats Page
    When move on to Categories dropdown menu
    Then move to Hats and click on All Hats
    Then verify Hats page is displayed
    Then verify Cuffed Beanie image,brand,text,price is present
    And click on Cuffed Beanie item picture
#    Then verify Cuffed Beanie item name is present
