Feature:Kids & Youth Page Functionality

  @Kids
  Scenario:Navigating and Verifying Kids & Youth Page
    Given user is in landing page and signs in
    When user lands on All Kids&Youth's Clothing page and verifies

#    When move on to Categories dropdown menu
#    Then move on to Kids&Youth Clothing sub-menu
#    And move and click on All Kids&Youth Clothing
#    Then verify that Kids&Youth Clothing text is present

    And user verifies that first Kids&Youth product's features are present

#    And verify that first kids item image is present
#    And verify that kids item brand name is present
#    Then verify that kids item title is present
#    And verify that kids item price is present

    Then user clicks on first Kids&Youth product and verifies
#    And click on first kids item picture
#    Then verify that first kids item name is present