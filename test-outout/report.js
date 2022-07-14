$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/smomer/IdeaProjects/FreeCRMBDDFramework/src/test/java/Features/Elements/Upload_Download.feature");
formatter.feature({
  "line": 1,
  "name": "Click on the Upload And Download",
  "description": "",
  "id": "click-on-the-upload-and-download",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Upload image and download",
  "description": "",
  "id": "click-on-the-upload-and-download;upload-image-and-download",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The title of Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Elements",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User select upload and Download from accordion tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User select Choose file and Upload",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Download the file",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "click-on-the-upload-and-download;upload-image-and-download;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "click-on-the-upload-and-download;upload-image-and-download;;1"
    },
    {
      "cells": [
        "omer_test",
        "Omer2@38"
      ],
      "line": 13,
      "id": "click-on-the-upload-and-download;upload-image-and-download;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Upload image and download",
  "description": "",
  "id": "click-on-the-upload-and-download;upload-image-and-download;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "The title of Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"omer_test\" and \"Omer2@38\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Elements",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User select upload and Download from accordion tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User select Choose file and Upload",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Download the file",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.verify_the_page_title()"
});
formatter.result({
  "duration": 98557368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "omer_test",
      "offset": 13
    },
    {
      "val": "Omer2@38",
      "offset": 29
    }
  ],
  "location": "LoginStepDefination.enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 1343154966,
  "status": "passed"
});
formatter.match({
  "location": "TextBoxFormStepDefinations.Click_On_Element()"
});
formatter.result({
  "duration": 55884934,
  "status": "passed"
});
formatter.match({
  "location": "UploadAndDownloadStepDefinations.Select_Upload_And_Download_From_Accordion()"
});
formatter.result({
  "duration": 1080073701,
  "status": "passed"
});
formatter.match({
  "location": "UploadAndDownloadStepDefinations.Select_Upload_File()"
});
formatter.result({
  "duration": 1066293645,
  "status": "passed"
});
formatter.match({
  "location": "UploadAndDownloadStepDefinations.Download_File()"
});
formatter.result({
  "duration": 2065776413,
  "status": "passed"
});
});