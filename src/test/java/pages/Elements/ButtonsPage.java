package pages.Elements;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends TestBase {


    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Buttons']")
    WebElement By_Accordion_Buttons;

    @FindBy(id = "doubleClickBtn")
    WebElement By_DoubleClick;
    @FindBy(id = "rightClickBtn")
    WebElement By_RightClick;

    @FindBy(xpath = "//button[contains(@id,'VXwxC')and normalize-space(text())='Click Me']")
    WebElement By_SingleClick;
    @FindBy(id = "doubleClickMessage")
    WebElement DoubleClickMessage;
    @FindBy(id = "rightClickMessage")
    WebElement RightClickMessage;
    @FindBy(id = "dynamicClickMessage")
    WebElement ClickMessage;

    WebElement out = DoubleClickMessage;
    WebElement out_two= RightClickMessage;
    WebElement out_three=ClickMessage;


    Actions actions = new Actions(driver);

    public ButtonsPage() {
        PageFactory.initElements(driver, this);
    }


    public void SelectButtonsFromAccordion() {
        By_Accordion_Buttons.click();
    }

    public void DoubleClickTheButton() throws InterruptedException {
        actions.doubleClick(By_DoubleClick).perform();
        Thread.sleep(1000);
    }

    public void RightClickTheButton() throws InterruptedException {
        actions.contextClick(By_RightClick).perform();
        Thread.sleep(1000);
    }


    public void ClickButton() throws InterruptedException {
       actions.click(By_SingleClick).perform();
        Thread.sleep(1000);

    }

    public String VerifyTheDoubleClick() {
        if (out == DoubleClickMessage) {
            return DoubleClickMessage.getText();
        } else if (out_two==RightClickMessage) {
            return RightClickMessage.getText();
        }
        else if (out_three==ClickMessage) {
            return ClickMessage.getText();
        }

        return null;
    }
    public void refresh(){

        driver.navigate().refresh();
    }
}
