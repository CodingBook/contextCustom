Feature:Women's Clothing Page Functionality

  @Women
  Scenario:Navigating and Verifying Women's Clothing Page
    Given User is in landing page and sign in
    When move on to Categories dropdown menu
    Then move on to Women's Clothing sub-menu
    And move and click on All Women's Clothing
    Then verify that Women's Clothing text is present
