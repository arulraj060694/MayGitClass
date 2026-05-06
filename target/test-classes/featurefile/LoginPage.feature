Feature: Validation of Facebook Webpage

  Scenario: Verifiying the valid userName and Password
    Given usre should open the application
    When user should enter the "<userName>" and "<password>"
    Then verifiying the home page

 @rgression
  Scenario Outline: Verifiying the valid userName and Password
    Given usre should open the application
    When user should enter the "<userName>" and "<password>"
    Then verifiying the home page
Examples:
|userName| |password|
|dsfdsnf|  |mdsnjdsbf|
|jdsbfdskjbf| |jldsfnsjnfjew|