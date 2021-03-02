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
