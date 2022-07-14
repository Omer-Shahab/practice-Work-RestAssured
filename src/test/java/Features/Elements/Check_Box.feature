Feature: Click on the check box

  Scenario Outline: Click on the check box
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on Elements
    Then User select Check Box from accordion
    Then User tick the check box
    Then Verify the output after clicking the check box


    Examples:
      | username  | password |
      | omer_test | Omer2@38 |