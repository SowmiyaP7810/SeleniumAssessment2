Feature: Test Account overview functionality

  Scenario: Check opennewaccount is successful
    Given browser is open
    And user is logged into the page
    When user clicks Account Overview
    Then user is navigated to the Account Overview page