package pages.AlertsAndModal;

import TestBase.TestBase;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modal extends TestBase {
    public Modal() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Modal Dialogs']")
    WebElement By_Modal;

    @FindBy(id = "showSmallModal")
    WebElement By_SmallModalBtn;
    @FindBy(id = "showLargeModal")
    WebElement By_LargeModalBtn;
    @FindBy(id = "closeSmallModal")
    WebElement CloseModal;
    @FindBy(id = "closeLargeModal")
    WebElement CloselARGEModal;

    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void ClickModal() throws InterruptedException {
//        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", By_Modal);
        By_Modal.click();
    }

    public void ClickSmallModalBtn() {
        By_SmallModalBtn.click();
    }
    public void ClickLargeModalBtn() {
        By_LargeModalBtn.click();
    }

    public void smallModal() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
        Thread.sleep(1000);
        CloseModal.click();
        driver.navigate().refresh();
    }
    public void LargeModal() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
        Thread.sleep(1000);
        CloselARGEModal.click();
        driver.navigate().refresh();
    }


}
