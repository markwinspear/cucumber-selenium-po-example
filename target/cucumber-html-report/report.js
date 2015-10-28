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
    },
    {
      "line": 1,
      "name": "@sauce"
    }
  ]
});
formatter.before({
  "duration": 7836958100,
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
  "location": "LoginSteps.java:27"
});
formatter.result({
  "duration": 1894909100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:32"
});
formatter.result({
  "duration": 2964701100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:36"
});
formatter.result({
  "duration": 25416100,
  "status": "passed"
});
formatter.after({
  "duration": 949743200,
  "status": "passed"
});
});