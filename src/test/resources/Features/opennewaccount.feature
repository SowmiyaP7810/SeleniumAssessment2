Feature: Test opennewaccount functionality

  Scenario: Check opennewaccount is successful
    Given browser is open
    And user is logged into the page
    When user clicks Open New Account
    Then user is navigated to the opennewaccount page

    