package StepDefinations;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Elements.TextBoxPage;

public class TextBoxFormStepDefinations extends TextBoxPage {



    @Then("^User clicks on Elements$")
    public void Click_On_Element() {
        ClickElement();
    }

    @Then("^User select Text Box$")
    public void Select_Text_Box() {
        SelectTextBox();
    }

    @Then("^User fill the details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void Enter_Text_Form_Detail(String fullname, String email, String c_address, String p_address) {
        FillTextForm(fullname, email, c_address, p_address);
    }

    @Then("^User click on submit button$")
    public void Submit_Text_Form() {
        SubmitTextForm();
    }

    @Then("^Verify the output$")
    public void Verify_Output() {
        String output = VerifyTheOutput();
        Assert.assertEquals(output, output);
    }

}
