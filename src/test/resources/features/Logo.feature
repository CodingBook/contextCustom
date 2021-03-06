
 @logo
Feature:Verifying the company  Logo is present

  Background:
    Given user is on the landing page



Scenario:As a user I  want to verify Logo
  Then user should click Logo
  And user verify the Logo  is displayed


  Scenario Outline: As a user I want to display page information
    Then user  enabled to see "<Container>"
Examples:
      |Container|
      |Fast and free delivery|
      |Money back guarantee  |
      |24/7customer support  |
      |Secure online payment |

  Scenario: As a user I want to see company address is present
    Then user  enabled to see address on displayed