package StepDefinations;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Elements.TextBoxPage;
import pages.Forms.FormPage;

import java.awt.*;

public class FormStepDefinations extends FormPage {


    @Then("^User clicks on Forms$")
    public void Click_On_Forms() {
        ClickForms();
    }

    @Then("^User select practice forms$")
    public void Select_Practice_Form() {
        SelectPracticeForm();
    }

    @Then("^User fill the practice form \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void Enter_Practice_Form_Detail(String Firstname, String Lastname, String Email, String MobileNumber, String Subject, String Current_Address, String Karnal) throws InterruptedException{
        FillPracticeForm(Firstname, Lastname, Email, MobileNumber, Subject, Current_Address, Karnal);
    }

    @Then("^User click on submit$")
    public void Submit_practice_Form() {
        ClickSubmit();
    }


}
