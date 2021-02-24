Feature:Men's Clothing Page Functionality

  @Women
  Scenario:Navigating and Verifying Men's Clothing Page
    Given User is in landing page and sign in
    When move on to Categories dropdown menu
    Then move on to Men's Clothing sub-menu
    And move and click on All Men's Clothing
    Then verify that Men's Clothing text is present
