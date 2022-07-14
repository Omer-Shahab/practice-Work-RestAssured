package StepDefinations;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Elements.CheckBoxPage;
import pages.Elements.RadioButtonPage;

public class RadioButtonFormStepDefinations extends RadioButtonPage {



    @Then("^User select radio button from accordion tab$")
    public void Select_Radio_Btn_From_Accordion() {
        SelectRadioBtnFromAccordion();
    }
    @Then("^User tick the radio option$")
    public void Select_Check_Box()
    {
        ClickRadioBtn();
    }




    @Then("^Verify the output after clicking the radio button$")
    public void Verify_Check_Box_Output() {
        String result = VerifyTheOutputOfRadioBtn();
        Assert.assertEquals(result, result);
    }

}
