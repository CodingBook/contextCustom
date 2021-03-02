Feature: Verifying the MainPage

  @Products
  Scenario Outline: Navigating and Verifying Products
    Given user is in landing page and signs in

    When user verifies that images "<categories images>" are displayed
    And user verifies that headings "<categories headings>" are displayed
    And user verifies that names "<products names>" are present
    Then user clicks on Bottoms product and verifies
    Examples:
      | categories images   | categories headings   | products names |
      | accessories         | Accessories           | Backpacks      |
      | hats                | Hats                  | Beanies        |
      | home-living         | Home & Living         | Blankets       |
      | kids-youth-clothing | Kids & Youth Clothing | Baby Bibs      |
      | mens-clothing       | Men's Clothing        | Bottoms        |
      | womens-clothing     | Women's Clothing      | Bottoms        |