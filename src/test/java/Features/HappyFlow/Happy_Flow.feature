Feature: Happy Flow


  Scenario Outline: Login Test Scenario
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Examples:
      | username  | password |
      | omer_test | Omer2@38 |

  Scenario Outline: Fill Text Box Form Scenario
    Then User clicks on Elements
    Then User select Text Box
    Then User fill the details "<fullname>" and "<email>" and "<c_address>" and "<p_address>"
    Then User click on submit button
    Then Verify the output
    Then Refresh the page and run other scenario
    Examples:
     | fullname    | email                  | c_address        | p_address        |
     | Omer Shahab | omershahab23@gmail.com | A-39 N.Nazimabad | A-34 N.Nazimabad |

  Scenario:Fill the Check Box
      Then User clicks on Elements
      Then User select Check Box from accordion
      Then User tick the check box
      Then Verify the output after clicking the check box
      Then Refresh the page and run other scenario

  Scenario:Double Click on the Button
        Then User clicks on Elements
        Then User select buttons from accordion tab
        Then User select buttons and double click it
        Then verify the output after clicking the button
        Then Refresh the page and run other scenario

  Scenario: Right Click on the Button
    Then User clicks on Elements
    Then User select buttons and Right click it
    Then verify the output after clicking the button
    Then Refresh the page and run other scenario

  Scenario: Click on the radio button
    Then User clicks on Elements
    Then User select radio button from accordion tab
    Then User tick the radio option
    Then Verify the output after clicking the radio button
    Then Refresh the page and run other scenario

  Scenario Outline: Click on the web table and register itself
    Then User clicks on Elements
    Then User select web table from accordion tab
    Then User click on add button to add new record
    Then User fill the details for new record "<firstname>" and "<lastname>" and "<email>" and "<age>" and "<salary>" and "<department>"
    Then User click on submit button to get registered for new record

    Examples:
    | firstname | lastname | email | age | salary | department |
    | omer      | shahab | omershahab238@gmail.com | 25 | 9000 | development |


  Scenario Outline: Select and Fill the Practice Form Feature
    Then User clicks on Forms
    And User select practice forms
    Then User fill the practice form "<Firstname>" and "<Lastname>" and "<Email>" and "<MobileNumber>" and "<Subject>" and "<Current_Address>" and "<Karnal>"
    Then User click on submit
    Then Refresh the page and run other scenario

    Examples:
      | Firstname    | Lastname | Email                  |  MobileNumber        | Subject        | Current_Address        | Karnal |
      | Omer  | Shahab          |omershahab23@gmail.com  | 3168656166            | Computer Science|  A-39 N.Nazimabad | Karnal |


  Scenario: Perform Simple Alert Action
    Then User clicks on Alerts and Modals from accordion tab
    Then User select the alerts from option
    Then User Click Button to see alert
    Then Verify the alert output


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


  Scenario: Perform Small modal action
    Then User select the modal from option
    Then User Click on small modal button
    Then Verify the modal output


  Scenario: Perform Large modal action
    Then User select the modal from option
    Then User Click on large modal button
    Then Verify the large modal output
    Then Refresh the page and run other scenario