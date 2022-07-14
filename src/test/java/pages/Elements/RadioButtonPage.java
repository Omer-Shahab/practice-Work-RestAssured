package pages.Elements;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage extends TestBase {


    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Radio Button']")
    WebElement By_Accordion_Radio_Button;
    @FindBy(xpath = "//label[@for='yesRadio']")
    WebElement By_click_radio_btn;


    @FindBy(className = "text-success")
    WebElement result;

    public RadioButtonPage() {
        PageFactory.initElements(driver, this);
    }


    public void SelectRadioBtnFromAccordion() {
        By_Accordion_Radio_Button.click();
    }

    public void ClickRadioBtn() {
        By_click_radio_btn.click();
    }


    public String VerifyTheOutputOfRadioBtn() {
        return result.getText();
    }


}
