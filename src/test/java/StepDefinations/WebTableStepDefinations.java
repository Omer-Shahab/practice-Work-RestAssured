package StepDefinations;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Elements.WebTablePage;

public class WebTableStepDefinations extends WebTablePage {



    @Then("^User select web table from accordion tab$")
    public void Select_Web_Table_From_Accordion() {
        SelectWebTableFromAccordion();
    }
    @Then("^User click on add button to add new record$")
    public void Click_Add_Btn()
    {
        ClickAddNewRecordBtn();
    }
    @Then("^User fill the details for new record \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void Enter_Detail_For_New_Record(String firstname, String lastname, String email, String age, String salary, String department) {
        EnterNewRecordDetail(firstname, lastname, email, age, salary, department);
    }
    @Then("^User click on submit button to get registered for new record$")
    public void Click_Submit_Btn() throws InterruptedException {
        ClickSubmitForAddNewRecord();
    }
}
