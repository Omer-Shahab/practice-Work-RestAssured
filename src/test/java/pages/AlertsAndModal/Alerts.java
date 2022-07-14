package pages.AlertsAndModal;

import TestBase.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alerts extends TestBase {
    @FindBy(xpath = "//div[contains(@class,'header-text')and normalize-space(text())='Alerts, Frame & Windows']")
    WebElement By_AlertAndModal;

    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Alerts']")
    WebElement By_Alert;

    @FindBy(id = "alertButton")
    WebElement By_AlertBtn;

    @FindBy(id = "timerAlertButton")
    WebElement By_TimeAlertBtn;

    @FindBy(id = "confirmButton")
    WebElement By_ConfirmAlertBtn;

    @FindBy(id = "promtButton")
    WebElement By_PromptAlertBtn;


    public Alerts() {
        PageFactory.initElements(driver, this);
    }
    public void ClickAlrertsAndModal() {
        By_AlertAndModal.click();
    }

    public void ClickAlert() {
        By_Alert.click();
    }
    public boolean ClickAlertBtn() {
        By_AlertBtn.click();
        return false;
    }
    public boolean ClickTimeAlert() throws InterruptedException {

        By_TimeAlertBtn.click();
        Thread.sleep(6000);
        return false;
    }
    public void ClickThirdAlert() {
        By_ConfirmAlertBtn.click();
    }
    public void ConfirmAlertMessage() throws InterruptedException {
        Alert SimpleAlert = driver.switchTo( ).alert( );
        String alertText = SimpleAlert.getText();
        Thread.sleep(1000);
        SimpleAlert.accept();
        driver.navigate().refresh();
        Thread.sleep(1000);
    }

    public void ClickPromptAlert() {
        By_PromptAlertBtn.click();
    }
    public void PromptAlertMessage() throws InterruptedException {
        Alert SimpleAlert = driver.switchTo( ).alert( );
        String alertText = SimpleAlert.getText();
        SimpleAlert.sendKeys("Omer and Rakesh");
        SimpleAlert.accept();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
    }


    public void alertaccept() throws InterruptedException {
        Alert SimpleAlert = driver.switchTo( ).alert( );
        Thread.sleep(1000);
        SimpleAlert.accept();
        driver.navigate().refresh();
        Thread.sleep(1000);
    }

    public void timealertmessage() throws InterruptedException {
        Alert SimpleAlert = driver.switchTo( ).alert( );
        Thread.sleep(1000);
        SimpleAlert.accept();
        driver.navigate().refresh();
        Thread.sleep(1000);
    }


}
