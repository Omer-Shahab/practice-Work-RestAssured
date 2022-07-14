package StepDefinations;

import cucumber.api.java.en.Then;

public class DatePicker extends pages.Widgets.DatePicker {
    @Then("^User clicks on widgets$")
    public void clickWidgets(){
        ClickWidgets();
    }
    @Then("^User select date from widgets$")
    public void clickdate(){
        ClickDate();
    }
}
