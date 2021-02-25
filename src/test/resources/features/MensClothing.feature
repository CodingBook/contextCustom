Feature:Men's Clothing Page Functionality

  @Men
  Scenario:Navigating and Verifying Men's Clothing Page
    Given User is in landing page and sign in
    When move on to Categories dropdown menu
    Then move on to Men's Clothing sub-menu
    And move and click on All Men's Clothing
    Then verify that Men's Clothing text is present

    And verify that first men item image is present
    And verify that men item brand name is present
    Then verify that men item title is present
    And verify that men item price is present
    And click on men kids item picture
    Then verify that first men item name is present