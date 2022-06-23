$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('TestCases\LoginFunctionality.feature');
formatter.feature({
  "line": 1,
  "name": "This file contains Login functionality testcases",
  "description": "",
  "id": "this-file-contains-login-functionality-testcases",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test Login functionality with Valid credentials",
  "description": "",
  "id": "this-file-contains-login-functionality-testcases;test-login-functionality-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"Admin\" in UserName field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"admin123\" in Password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFunctionalityStepDefinations.GotoLoginPage()"
});
formatter.result({
  "duration": 33992359900,
  "status": "passed"
});
formatter.match({
  "location": "LoginFunctionalityStepDefinations.EnterUserName()"
});
formatter.result({
  "duration": 5161703500,
  "status": "passed"
});
formatter.match({
  "location": "LoginFunctionalityStepDefinations.EnterPassword()"
});
formatter.result({
  "duration": 5122606500,
  "status": "passed"
});
formatter.match({
  "location": "LoginFunctionalityStepDefinations.ClickLoginButton()"
});
formatter.result({
  "duration": 9810859900,
  "status": "passed"
});
formatter.match({
  "location": "LoginFunctionalityStepDefinations.CheckIfDashboardPageOpens()"
});
formatter.result({
  "duration": 47173300,
  "status": "passed"
});
});