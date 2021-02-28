Feature: MainPage Header and Custom Print Verification

  Scenario Outline: Verifying MainPage Header and Custom Print

    Given User verifies the landing page

    When  Verifies that "<Header elements>" are present

    And   Verifies that "<Custom Print elements>" are present

    Then  Clicks on Print Now and verifies the page


    Examples:
      | Header elements | Custom Print elements                 |
      | How It Works?   | Custom printed & embroidered products |
      | Free Mockups    | We'll print & ship it for you!        |
      | Buy Designs     | Bring your Tee                        |
      | SearchIcon      | Make an Order Image                 |
      | My Account      | Print Now Image                        |
      | cartIcon        | Make An Order Button                     |
      | My Cart         | Print Now Button                        |





