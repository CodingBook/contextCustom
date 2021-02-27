Feature: Verifying the MainPage

  @Brands
  Scenario Outline:Navigating and Verifying Brand logos
    When User verifies that Brands is present
    And user verifies that "<brand Logos>" are displayed
    Examples:
      | brand Logos    |
      | Context Custom |
      | Gildan         |
      | Brand          |


#    Then User verifies that "Context Custom" logo is present
#    Then User verifies that "Gildan" logo is present
#    Then User verifies that "Brand" logo is present
