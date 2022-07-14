Feature: Click on the Upload And Download

  Scenario Outline: Upload image and download
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on Elements
    Then User select upload and Download from accordion tab
    Then User select Choose file and Upload
    Then Download the file

    Examples:
      | username  | password |
      | omer_test | Omer2@38 |
