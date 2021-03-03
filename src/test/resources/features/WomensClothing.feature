Feature:Women's Clothing Page Functionality

  @Women
  Scenario:Navigating and Verifying Women's Clothing Page
    Given User is in landing page and sign in
    When move on to Categories dropdown menu
    Then move on to Women's Clothing sub-menu
    And move and click on All Women's Clothing
    Then verify that Women's Clothing text is present

    And verify that first women item image is present
    And verify that women item brand name is present
    Then verify that women item title is present
    And verify that women item price is present
    And click on first women item picture
    Then verify that first women item name is present