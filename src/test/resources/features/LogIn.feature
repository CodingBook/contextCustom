Feature: Login process test
  Scenario: Login process using an account with correct credentials
    Given User is in the contextcustom.com homepage
    When User clicks to signin
    And User enters correct "email" in the signin section
    And User enters correct "password" in the signin section
    Then User clicks Sign In button in the signin section

  Scenario: Login process using an account with incorrect email
    Given User is in the contextcustom.com homepage
    When User clicks to signin
    And User enters incorrect "email" in the signin section
    And User enters correct "password" in the signin section
    Then User clicks Sign In button in the signin section

  Scenario: Login process using an account with incorrect password
    Given User is in the contextcustom.com homepage
    When User clicks to signin
    And User enters correct "email" in the signin section
    And User enters incorrect "password" in the signin section
    Then User clicks Sign In button in the signin section

  Scenario: Login process using an account with incorrect credentials
    Given User is in the contextcustom.com homepage
    When User clicks to signin
    And User enters incorrect "email" in the signin section
    And User enters incorrect "password" in the signin section
    Then User clicks Sign In button in the signin section