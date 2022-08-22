Feature: Test Request Loan functionality

  Scenario Outline: Check Request Loan is successful
    Given browser is open
    And user is logged into the page
    When user clicks Request Loan
    And user enters <Loan Amount> and <Down Payment> and <From Account>
    Then user is navigated to the Request Loan page
    And clicks the apply now
    
    Examples: 
      | Loan Amount | Down Payment |From Account |
      | 40000  |    3000  |20000|
      