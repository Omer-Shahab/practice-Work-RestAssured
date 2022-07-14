package StepDefinations;

import cucumber.api.java.en.Then;
import pages.AlertsAndModal.Alerts;

public class AlertsStep extends Alerts {

    @Then("^User clicks on Alerts and Modals from accordion tab$")
    public void Click_On_Alert_And_Modal() {
        ClickAlrertsAndModal();
    }

    @Then("^User select the alerts from option$")
    public void Select_Alert() {
        ClickAlert();
    }

    @Then("^User Click Button to see alert$")
    public void Click_Simple_Alert() {
        ClickAlertBtn();
    }
    @Then("^User Click second button to see second alert$")
    public void Click_Time_Alert() throws InterruptedException {
        ClickTimeAlert();
    }

    @Then("^Verify the alert output$")
    public void Verify_Simple_Alert() throws InterruptedException {
        alertaccept();
    }

    @Then("^Verify the alert output after five second$")
    public void Verify_Time_Alert() throws InterruptedException {
        timealertmessage();
    }
    @Then("^User Click Third button to see Third alert$")
    public void Click_Confirm_Btn_Alert() {
        ClickThirdAlert();
    }
    @Then("^Verify the alert output of confirm button action$")
    public void Verify_Confirm_Alert() throws InterruptedException {
        ConfirmAlertMessage();
    }

    @Then("^User Click Fourth button to see Prompt alert$")
    public void Click_Prompt_Btn_Alert() {
        ClickPromptAlert();
    }
    @Then("^Verify the prompt alert output of prompt button action$")
    public void Verify_Prompt_Alert() throws InterruptedException {
        PromptAlertMessage();
    }
}
