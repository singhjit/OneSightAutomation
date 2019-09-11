$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature Test",
  "description": "",
  "id": "login-feature-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 75,
  "name": "Login Feature5",
  "description": "",
  "id": "login-feature-test;login-feature5",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 74,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 77,
  "name": "user opens a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 78,
  "name": "user is on onesight login page",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "user enters username and password and logs into onesight",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "user goes to configure page",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "user clicks on roles link",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "user clicks on add role link to add a role",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "user enters add role details \"\u003crolename\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "user closes add role window",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "user logs out from onesight",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 89,
  "name": "",
  "description": "",
  "id": "login-feature-test;login-feature5;",
  "rows": [
    {
      "cells": [
        "rolename"
      ],
      "line": 90,
      "id": "login-feature-test;login-feature5;;1"
    },
    {
      "cells": [
        "automationrole1"
      ],
      "line": 91,
      "id": "login-feature-test;login-feature5;;2"
    },
    {
      "cells": [
        "automationrole2"
      ],
      "line": 92,
      "id": "login-feature-test;login-feature5;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 91,
  "name": "Login Feature5",
  "description": "",
  "id": "login-feature-test;login-feature5;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 74,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 77,
  "name": "user opens a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 78,
  "name": "user is on onesight login page",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "user enters username and password and logs into onesight",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "user goes to configure page",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "user clicks on roles link",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "user clicks on add role link to add a role",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "user enters add role details \"automationrole1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "user closes add role window",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "user logs out from onesight",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_a_browser()"
});
formatter.result({
  "duration": 6801450184,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_onesight_login_page()"
});
formatter.result({
  "duration": 37725046,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password_and_logs_into_onesight()"
});
formatter.result({
  "duration": 1847043269,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_goess_to_configure_page()"
});
formatter.result({
  "duration": 319904904,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_roles_link()"
});
formatter.result({
  "duration": 398308375,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_add_role_link_to_add_a_role()"
});
formatter.result({
  "duration": 2513246935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automationrole1",
      "offset": 30
    }
  ],
  "location": "HomePageSteps.user_enters_add_role_details(String)"
});
formatter.result({
  "duration": 2828990556,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_closes_add_role_window()"
});
formatter.result({
  "duration": 2539282088,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_logs_out_from_onesight()"
});
formatter.result({
  "duration": 283669922,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_closes_the_browser()"
});
formatter.result({
  "duration": 114825278,
  "status": "passed"
});
formatter.scenario({
  "line": 92,
  "name": "Login Feature5",
  "description": "",
  "id": "login-feature-test;login-feature5;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 74,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 77,
  "name": "user opens a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 78,
  "name": "user is on onesight login page",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "user enters username and password and logs into onesight",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "user goes to configure page",
  "keyword": "Then "
});
formatter.step({
  "line": 81,
  "name": "user clicks on roles link",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "user clicks on add role link to add a role",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "user enters add role details \"automationrole2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "user closes add role window",
  "keyword": "Then "
});
formatter.step({
  "line": 85,
  "name": "user logs out from onesight",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_a_browser()"
});
formatter.result({
  "duration": 3767813577,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_onesight_login_page()"
});
formatter.result({
  "duration": 9697252,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password_and_logs_into_onesight()"
});
formatter.result({
  "duration": 1446743860,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_goess_to_configure_page()"
});
formatter.result({
  "duration": 1815823938,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_roles_link()"
});
formatter.result({
  "duration": 571866606,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_add_role_link_to_add_a_role()"
});
formatter.result({
  "duration": 5828899064,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automationrole2",
      "offset": 30
    }
  ],
  "location": "HomePageSteps.user_enters_add_role_details(String)"
});
formatter.result({
  "duration": 2675480473,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_closes_add_role_window()"
});
formatter.result({
  "duration": 2386205230,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_logs_out_from_onesight()"
});
formatter.result({
  "duration": 224880956,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_closes_the_browser()"
});
formatter.result({
  "duration": 120332682,
  "status": "passed"
});
});