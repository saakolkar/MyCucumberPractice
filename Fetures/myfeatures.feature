Feature: Test Selenium Easy WebSite

  Scenario Outline: Verify show message functionality
    Given Launch simpleformspage
    When Enter "<ExpectedMessage>" and click show messagebutton
    Then I validate the Message is same as "<ExpectedMessage>"

    Examples: 
      | ExpectedMessage |
      | Ram123          |
      | Baghayashri@444 |
      | Apurva###       |
