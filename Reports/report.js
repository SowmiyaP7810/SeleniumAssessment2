$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/updatecontactinfo.feature");
formatter.feature({
  "name": "Test Update Contact info functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check Update Contact info is successful",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.LoginBanksteps.browser_is_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is logged into the page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.OpenNewAccountSteps.user_is_logged_into_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks Update Contact Info",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is navigated to the Update Contact Info  page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});