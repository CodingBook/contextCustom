@about
Feature:Verifying the  About us
  Background:
    Given user is on the landing page


  Scenario: As a user I want to enabled to see About us tab
    Then user should  About company  enabled under  About us department
    Then user should  Our team   enabled under About us department
    Then user should Careers enabled under About us department


  Scenario Outline:As a user I want to verify Follow us tab

      Then user should enable to see "<social media button>"
      Then user click on youtube;
      Examples:
      |social media button|
      |twitter     |
      |facebook    |
      |instagram   |
      |youtube     |

  Scenario: As a user I want to display <bottom> information
    Then user should see bottom page
      |Fast and free delivery|
      |Money back guarantee|
      |24/7 customer support|
      |Secure online payment|