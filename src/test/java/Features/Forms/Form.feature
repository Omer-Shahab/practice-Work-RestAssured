Feature: Fill the Practice Form Feature

  Scenario Outline: Select and Fill the Practice Form Feature
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on Forms
    And User select practice forms
    Then User fill the practice form "<Firstname>" and "<Lastname>" and "<Email>" and "<MobileNumber>" and "<Subject>" and "<Current_Address>" and "<Karnal>"
    Then User click on submit

    Examples:
      | username  | password | Firstname    | Lastname | Email                  |  MobileNumber        | Subject        | Current_Address        | Karnal |
      | omer_test | Omer2@38 | Omer  | Shahab          |omershahab23@gmail.com  | 3168656166            | Computer Science|  A-39 N.Nazimabad | Karnal |