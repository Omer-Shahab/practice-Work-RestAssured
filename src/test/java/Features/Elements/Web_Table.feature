Feature: Click on the web table and register itself

  Scenario Outline: Click on the web table and register itself
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then User clicks on Elements
    Then User select web table from accordion tab
    Then User click on add button to add new record
    Then User fill the details for new record "<firstname>" and "<lastname>" and "<email>" and "<age>" and "<salary>" and "<department>"
    Then User click on submit button to get registered for new record

    Examples:
      | username  | password | firstname | lastname | email | age | salary | department |
      | omer_test | Omer2@38 | omer      | shahab | omershahab238@gmail.com | 25 | 9000 | development |