Feature:Home & Living Page Functionality

  @Accessories
  Scenario:Navigating and Verifying Home & Living Page
    When move on to Categories dropdown menu for Home & Living
    When move on to Home & Living
    Then move on to All Home & Living Page and click
    And verify  Home & Living  text is present

    And print all links from the current page
    And click  Ceramic Mug item picture
    Then verify Ceramic Mug image is present
    And verify  Ceramic Mug item brand name is present
    Then verify Ceramic Mug item text is present
    And verify Ceramic Mug item price is present

#    Then verify Ceramic Mug item name is present