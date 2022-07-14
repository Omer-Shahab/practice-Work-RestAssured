package StepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import org.junit.Assert;

import pages.Login.LoginPage;


public class LoginStepDefination extends LoginPage {


    @Given("^The title of Login page$")
    public void verify_the_page_title() {
        String title = ValidateLoginPageTitle();
        Assert.assertEquals("ToolsQA", title);

    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void enter_username_and_password(String username, String password) throws Throwable {

        login(username, password);
    }

    @Then("^Invalid Credential error message should appear$")
    public void verify_invalid_output() {
        String output = InvalidOutput();
        Assert.assertEquals(output, output);
    }

    @Then("^Clear the text field and run another scenario$")
    public void verify_clear_field() throws Throwable {
        ClearField();
    }

}
