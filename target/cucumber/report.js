$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("reqs.feature");
formatter.feature({
  "line": 1,
  "name": "Test the contact form in web application.",
  "description": "",
  "id": "test-the-contact-form-in-web-application.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14365451300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the demo store url \"http://services.smartbear.com/samples/TestComplete12/smartstore/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "navigate to contactus page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://services.smartbear.com/samples/TestComplete12/smartstore/",
      "offset": 34
    }
  ],
  "location": "Steps.i_navigate_to_the_demo_store_url(String)"
});
formatter.result({
  "duration": 2245239600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.navigate_to_contactus_page()"
});
formatter.result({
  "duration": 1682825200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "Test the form for submission.",
  "id": "test-the-contact-form-in-web-application.;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I enter a \"Superhero\" Name.",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter a \"u@me.com\" EmailId.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter enquiry",
  "rows": [
    {
      "cells": [
        "Enquiry line 1",
        "Enquiry line 2"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Submit Button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should be taken to the Succesful Submission Page.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Superhero",
      "offset": 11
    }
  ],
  "location": "Steps.i_enter_a_Name(String)"
});
formatter.result({
  "duration": 1211795900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "u@me.com",
      "offset": 11
    }
  ],
  "location": "Steps.i_enter_a_EmailId(String)"
});
formatter.result({
  "duration": 1287086700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_enquiry(DataTable)"
});
formatter.result({
  "duration": 2363607900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_Submit_Button()"
});
formatter.result({
  "duration": 1522239800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_be_taken_to_the_Succesful_Submission_Page()"
});
formatter.result({
  "duration": 1081949000,
  "status": "passed"
});
formatter.after({
  "duration": 1854682500,
  "status": "passed"
});
});