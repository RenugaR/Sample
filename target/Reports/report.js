$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/AdactinHomePage.feature");
formatter.feature({
  "name": "Adaction page login function",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@P1"
    },
    {
      "name": "@LogIn"
    },
    {
      "name": "@SMOKE"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the browser and navidate to adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactionHomePageSteps.user_launch_the_browser_and_navidate_to_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P1"
    },
    {
      "name": "@LogIn"
    },
    {
      "name": "@SMOKE"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@TC01"
    },
    {
      "name": "@login"
    },
    {
      "name": "@invalidDetails"
    }
  ]
});
formatter.step({
  "name": "User enters the username and password in adaction home page",
  "keyword": "When "
});
formatter.match({
  "location": "AdactionHomePageSteps.user_enters_the_username_and_password_in_adaction_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the login button",
  "keyword": "When "
});
formatter.match({
  "location": "AdactionHomePageSteps.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactionHomePageSteps.user_validates_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});