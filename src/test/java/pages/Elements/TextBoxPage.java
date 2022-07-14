package pages.Elements;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends TestBase {


    @FindBy(xpath = "//*[name()='path' and contains(@d,'M16 132h41')]")
    WebElement By_Element;

    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Text Box']")
    WebElement By_Text_box;

    @FindBy(id = "userName")
    WebElement By_Full_Name;

    @FindBy(id = "userEmail")
    WebElement By_Email;

    @FindBy(id = "currentAddress")
    WebElement By_C_Address;

    @FindBy(id = "permanentAddress")
    WebElement By_P_Address;


    @FindBy(id = "submit")
    WebElement Text_Submit;

    @FindBy(id = "output")
    WebElement By_Output;

    public TextBoxPage() {
        PageFactory.initElements(driver, this);
    }

    public void ClickElement() {
        By_Element.click();
    }

    public void SelectTextBox() {
        By_Text_box.click();
    }

    public void FillTextForm(String fullname, String email, String c_address, String p_address) {
        By_Full_Name.sendKeys(fullname);
        By_Email.sendKeys(email);
        By_C_Address.sendKeys(c_address);
        By_P_Address.sendKeys(p_address);
    }

    public void SubmitTextForm() {
        Text_Submit.click();
    }

    public String VerifyTheOutput() {
        return By_Output.getText();
    }

    public void Quit() throws InterruptedException{
        driver.quit();
    }


}
