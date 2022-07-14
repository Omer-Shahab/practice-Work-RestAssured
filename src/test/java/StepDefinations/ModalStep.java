package StepDefinations;

import cucumber.api.java.en.Then;
import pages.AlertsAndModal.Modal;

public class ModalStep extends Modal {

    @Then("^User select the modal from option$")
    public void Select_Modal() throws InterruptedException {
        ClickModal();
    }
    @Then("^User Click on small modal button$")
    public void Click_Small_Modal() {
        ClickSmallModalBtn();
    }
    @Then("^User Click on large modal button$")
    public void Click_Large_Modal() {
        ClickLargeModalBtn();
    }

    @Then("^Verify the modal output$")
    public void Verify_Close_Modal() throws InterruptedException {
        smallModal();
    }
    @Then("^Verify the large modal output$")
    public void Verify_Close_Large_Modal() throws InterruptedException {
        LargeModal();
    }

}
