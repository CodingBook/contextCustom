Feature: MainPage Header and Custom Print Verification

  Scenario Outline: Verifying MainPage Header and Custom Print

    Given User verifies the landing page

    When  Verifies that "<Header elements>" are present

    And   Verifies that "<Custom Print elements>" are present

    Then  Clicks on Print Now and verifies the page


    Examples:
      | Header elements | Custom Print elements                 |
      | How It Works?   | We'll print & ship it for you!        |
      | Free Mockups    | Custom printed & embroidered products |
      | Buy Designs     | Make an Order                         |
      | Search          | Bring Your Own Tee                    |
      | My Account      | Shop Converse                         |
      | cartIcon        | Bring Your Own Tee                    |
      | My Cart         | Shop Converse                         |





