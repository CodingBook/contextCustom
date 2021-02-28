Feature: Login process test
  Scenario Outline: Login process using an account with correct credentials
    Given User is in the contextcustom.com homepage
    When User clicks to signin
    And User enters correct email "<email>" in the signin section
    And User enters correct password "<password>" in the signin section
    Then User clicks Sign In button in the signin section
    Examples:
      | email               | password |
      | kutluhang@yahoo.com | 123456   |


  Scenario Outline: Login process using an account with incorrect email
    Given User is in the contextcustom.com homepage
    When User clicks to signin
    And User enters incorrect email "<email>" in the signin section
    And User enters correct password "<password>" in the signin section
    Then User clicks Sign In button in the signin section
    Examples:
      | email               | password |
      | utluhang@yahoo.com  | 123456   |

  Scenario Outline: Login process using an account with incorrect password
    Given User is in the contextcustom.com homepage
    When User clicks to signin
    And User enters correct email "<email>" in the signin section
    And User enters incorrect password "<password>" in the signin section
    Then User clicks Sign In button in the signin section
    Examples:
      | email               | password |
      | kutluhang@yahoo.com | 12345    |

  Scenario Outline: Login process using an account with incorrect credentials
    Given User is in the contextcustom.com homepage
    When User clicks to signin
    And User enters incorrect email "<email>" in the signin section
    And User enters incorrect password "<password>" in the signin section
    Then User clicks Sign In button in the signin section
    Examples:
      | email               | password |
      | utluhang@yahoo.com  | 12345    |
