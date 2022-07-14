package StepDefinations;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Elements.CheckBoxPage;

public class CheckBoxFormStepDefinations extends CheckBoxPage {



    @Then("^User select Check Box from accordion$")
    public void Select_Check_Box_From_Accordion() {
        SelectCheckBoxFromAccordion();
    }
    @Then("^User tick the check box$")
    public void Select_Check_Box() {
        TickCheckBox();
    }




    @Then("^Verify the output after clicking the check box$")
    public void Verify_Check_Box_Output() {
        String By_Result = VerifyTheOutputOfCheckBox();
        Assert.assertEquals(By_Result, By_Result);
    }

}
