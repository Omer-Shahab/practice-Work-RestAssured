package pages.Widgets;

import TestBase.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePicker extends TestBase {
    @FindBy(xpath = "//div[contains(@class,'header-text')and normalize-space(text())='Widgets']")
    WebElement By_Widgets;

    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Date Picker']")
    WebElement By_Date;


    WebElement By_PromptAlertBtn;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public DatePicker() {
        PageFactory.initElements(driver, this);
    }
    public void ClickWidgets() {
        js.executeScript("arguments[0].scrollIntoView();", By_Widgets);
        By_Widgets.click();
    }

    public void ClickDate() {
        js.executeScript("arguments[0].scrollIntoView();", By_Date);
        By_Date.click();
    }


}
