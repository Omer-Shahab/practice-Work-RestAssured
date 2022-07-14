Feature: Click on the Buttons

  Scenario Outline: Double Click on the Button
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on Elements
    Then User select buttons from accordion tab
    Then User select buttons and double click it
    Then verify the output after clicking the button
    Then Refresh the page and run other scenario

    Examples:
      | username  | password |
      | omer_test | Omer2@38 |

  Scenario: Right Click on the Button
    Then User select buttons and Right click it
    Then verify the output after clicking the button
    Then Refresh the page and run other scenario

