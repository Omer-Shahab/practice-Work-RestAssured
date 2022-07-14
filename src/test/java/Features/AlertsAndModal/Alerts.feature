Feature: Alerts Actions

  Scenario Outline: Perform Simple Alert Action
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on Alerts and Modals from accordion tab
    Then User select the alerts from option
    Then User Click Button to see alert
    Then Verify the alert output

    Examples:
      | username  | password |
      | omer_test | Omer2@38 |

    Scenario: Perform 5 second wait Alert Action
      Then User select the alerts from option
      Then User Click second button to see second alert
      Then Verify the alert output after five second

  Scenario: Perform Confirm Button Alert Action
    Then User select the alerts from option
    Then User Click Third button to see Third alert
    Then Verify the alert output of confirm button action

  Scenario: Perform Prompt Button Alert Action
    Then User select the alerts from option
    Then User Click Fourth button to see Prompt alert
    Then Verify the prompt alert output of prompt button action