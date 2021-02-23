Feature: Verifying the MainPage

  @Products
  Scenario: Navigating and Verifying Products

    When User navigate and verifies that More products button is present
    Then User verifies that "accessories" is displayed
    Then User verifies that "hats" is displayed
    Then User verifies that "home-living" is displayed
    Then User verifies that "kids-youth-clothing" is displayed
    Then User verifies that "mens-clothing" is displayed
    Then User verifies that "womens-clothing" is displayed

    Then User verifies that "Accessories" heading is present
    Then User verifies that "Hats" heading is present
    Then User verifies that "Home & Living" heading is present
    Then User verifies that "Kids & Youth Clothing" heading is present
    Then User verifies that "Men's Clothing" heading is present

    Then User verifies that "Backpacks" menu is present
    Then User verifies that "Beanies" menu is present
    Then User verifies that "Blankets" menu is present
    Then User verifies that "Baby Bibs" menu is present
    Then User verifies that "Bottoms" menu is present
    Then User verifies that "Bottoms" menu is present
    Then User verifies that "Women's Clothing" heading is present







