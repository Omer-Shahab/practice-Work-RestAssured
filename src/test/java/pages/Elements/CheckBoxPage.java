package pages.Elements;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage extends TestBase {


    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Check Box']")
    WebElement By_Accordion_Check_box;
    @FindBy(xpath = "//span[@class='rct-checkbox']//*[name()='svg']")
    WebElement By_Tick_Check_box;


    @FindBy(id = "result")
    WebElement By_Result;

    public CheckBoxPage() {
        PageFactory.initElements(driver, this);
    }


    public void SelectCheckBoxFromAccordion() {
        By_Accordion_Check_box.click();
    }

    public void TickCheckBox() {
        By_Tick_Check_box.click();
    }


    public String VerifyTheOutputOfCheckBox() {
        return By_Result.getText();
    }


}
