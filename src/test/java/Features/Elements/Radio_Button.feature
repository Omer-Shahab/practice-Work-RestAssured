Feature: Click on the radio button

  Scenario Outline: Click on the radio button
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on Elements
    Then User select radio button from accordion tab
    Then User tick the radio option
    Then Verify the output after clicking the radio button


    Examples:
      | username  | password |
      | omer_test | Omer2@38 |