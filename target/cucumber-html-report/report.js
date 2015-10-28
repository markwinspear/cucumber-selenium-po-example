$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Authentication",
  "description": "",
  "id": "authentication",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@p1"
    }
  ]
});
formatter.before({
  "duration": 7247199600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Successfully logging in",
  "description": "",
  "id": "authentication;successfully-logging-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the Symbiote home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "logging in as an admin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the home page navigation is available",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.java:18"
});
formatter.result({
  "duration": 1572550200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:23"
});
formatter.result({
  "duration": 2784071000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:27"
});
formatter.result({
  "duration": 25058200,
  "status": "passed"
});
formatter.after({
  "duration": 493581100,
  "status": "passed"
});
});