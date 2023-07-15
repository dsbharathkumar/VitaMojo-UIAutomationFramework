$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Functional_Tests.feature");
formatter.feature({
  "line": 1,
  "name": "Login tests",
  "description": "\nDescription: This feature file is to test login pages.",
  "id": "login-tests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6371355750,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Sign up Vita Mojo",
  "description": "",
  "id": "login-tests;sign-up-vita-mojo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@TC001"
    },
    {
      "line": 6,
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter details in signup form",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Validate account name",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAccount_steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 28094163750,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount_steps.enter_details_in_sign_up_form()"
});
formatter.result({
  "duration": 31243552334,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount_steps.validate_account_name()"
});
formatter.result({
  "duration": 17006016542,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount_steps.closeBrowser()"
});
formatter.result({
  "duration": 158069584,
  "status": "passed"
});
formatter.after({
  "duration": 155467458,
  "status": "passed"
});
formatter.before({
  "duration": 4619829041,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login to Vita Mojo",
  "description": "",
  "id": "login-tests;login-to-vita-mojo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@TC002"
    },
    {
      "line": 14,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccount_steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 28151278792,
  "status": "passed"
});
formatter.match({
  "location": "Loginpage_steps.enter_username_and_password()"
});
formatter.result({
  "duration": 13729865375,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount_steps.closeBrowser()"
});
formatter.result({
  "duration": 129224708,
  "status": "passed"
});
formatter.after({
  "duration": 82019791,
  "status": "passed"
});
});