Feature: Fill Text Box Feature

  Scenario Outline: Fill Text Box Form Scenario
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on Elements
    Then User select Text Box
    Then User fill the details "<fullname>" and "<email>" and "<c_address>" and "<p_address>"
    Then User click on submit button
    Then Verify the output


    Examples:
      | username  | password | fullname    | email                  | c_address        | p_address        |
      | omer_test | Omer2@38 | Omer Shahab | omershahab23@gmail.com | A-39 N.Nazimabad | A-34 N.Nazimabad |