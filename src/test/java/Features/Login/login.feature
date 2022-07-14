Feature: Free Login Feature
  @SmokeTest
  Scenario Outline: User Login in both invalid credentials
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then Invalid Credential error message should appear
    When Clear the text field and run another scenario
    Then Refresh the page and run other scenario

    Examples:
      | username   | password  |
      | omer_test1 | Omer2@381 |


  Scenario Outline: User Login in with invalid username and valid password
    Given The title of Login page
    When User enters "<username>" and "<password>"
    Then Invalid Credential error message should appear
    Then Clear the text field and run another scenario
    Then Refresh the page and run other scenario

    Examples:
      | username   | password |
      | omer_test1 | Omer2@382 |

@RegressionTest
  Scenario Outline: Login Test Scenario
    Given The title of Login page
    When User enters "<username>" and "<password>"

    Examples:
      | username  | password |
      | omer_test | Omer2@38 |