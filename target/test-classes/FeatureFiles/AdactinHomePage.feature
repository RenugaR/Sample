@P1 @LogIn @SMOKE @Regression
Feature: Adaction page login function

  @TC01 @login @invalidDetails
  Scenario: To validate login functionality with invalid username and invalid password
    Given User launch the browser and navidate to adactin page
    When User enters the username and password in adaction home page
    When User clicks the login button
    Then User validates the error message

  @TC02 @login
  Scenario: To validate login functionality with valid username and invalid password
    Given User launch the browser and navidate to adactin page
    When User enters the username and password in adaction home page
    When User clicks the login button
    Then User validates the error message

 
  Scenario Outline: To validate login functionality with combination of UserName and password
    Given User launch the browser and navidate to adactin page
    When User enters the "<userName>" and "<password>" in adaction home page
    And User clicks the login button
    Then User validates the error message

    Examples: 
      | userName  | password |
      | JohnPeter |  1234567 |
      | Hello     |  4567890 |
      | Selenium  |  4567890 |
