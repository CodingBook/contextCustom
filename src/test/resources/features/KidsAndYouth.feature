Feature:Kids & Youth Page Functionality

  @Kids
  Scenario:Navigating and Verifying Kids & Youth Page
    Given User is in landing page and sign in
    When move on to Categories dropdown menu
    Then move on to Kids&Youth Clothing sub-menu
    And move and click on All Kids&Youth Clothing
    Then verify that Kids&Youth Clothing text is present