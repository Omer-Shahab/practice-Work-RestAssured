Feature: Modals Actions

  Scenario Outline: Perform Small modal action
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on Alerts and Modals from accordion tab
    Then User select the modal from option
    Then User Click on small modal button
    Then Verify the modal output

    Examples:
      | username  | password |
      | omer_test | Omer2@38 |

  Scenario: Perform Large modal action
      Then User select the modal from option
      Then User Click on large modal button
      Then Verify the large modal output