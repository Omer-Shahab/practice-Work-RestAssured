Feature: Date Picker

  Scenario Outline: Pick The Date
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on widgets
    Then User select date from widgets
    Examples:
      | username  | password |
      | omer_test | Omer2@38 |