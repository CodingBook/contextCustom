Feature: Verifying the MainPage

## operation to log in everytime for each scenario
  Background:
    Given user is in landing page and signs in

  @Products
  Scenario Outline: Navigating and Verifying Products

    When user verifies that images "<categories images>" are displayed
#    Then User verifies that "accessories" is displayed
#    Then User verifies that "hats" is displayed
#    Then User verifies that "home-living" is displayed
#    Then User verifies that "kids-youth-clothing" is displayed
#    Then User verifies that "mens-clothing" is displayed
#    Then User verifies that "womens-clothing" is displayed

    And user verifies that headings "<categories headings>" are displayed
#
#    Then User verifies that "Accessories" heading is present
#    Then User verifies that "Hats" heading is present
#    Then User verifies that "Home & Living" heading is present
#    Then User verifies that "Kids & Youth Clothing" heading is present
#    Then User verifies that "Men's Clothing" heading is present

    And user verifies that names "<products names>" are present

#    Then User verifies that "Backpacks" menu is present
#    Then User verifies that "Beanies" menu is present
#    Then User verifies that "Blankets" menu is present
#    Then User verifies that "Baby Bibs" menu is present
#    Then User verifies that "Bottoms" menu is present
#    Then User verifies that "Bottoms" menu is present
#    Then User verifies that "Women's Clothing" heading is present

    Then user clicks on Bottoms product and verifies
    Examples:
      | categories images   | categories headings   | products names |
      | accessories         | Accessories           | Backpacks      |
      | hats                | Hats                  | Beanies        |
      | home-living         | Home & Living         | Blankets       |
      | kids-youth-clothing | Kids & Youth Clothing | Baby Bibs      |
      | mens-clothing       | Men's Clothing        | Bottoms        |
      | womens-clothing     | Women's Clothing      | Bottoms        |