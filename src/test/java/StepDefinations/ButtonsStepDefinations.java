package StepDefinations;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Elements.ButtonsPage;
import pages.Elements.WebTablePage;

public class ButtonsStepDefinations extends ButtonsPage {


    @Then("^User select buttons from accordion tab$")
    public void Select_Buttons_From_Accordion() {
        SelectButtonsFromAccordion();
    }
    @Then("^User select buttons and double click it$")
    public void Double_Click_The_Button() throws InterruptedException {
        DoubleClickTheButton();
    }
    @Then("^User select buttons and Right click it$")
    public void Right_Click_The_Button() throws InterruptedException {
        RightClickTheButton();
    }


    @Then("^verify the output after clicking the button$")
    public void Verify_The_Button_Output() {
        String output = VerifyTheDoubleClick();
        Assert.assertEquals(output, output);
    }
    @Then("^Refresh the page and run other scenario$")
    public void Refresh_The_Page(){
        refresh();

    }
}
