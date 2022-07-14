package pages.Login;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(id = "userName")
    WebElement Byusername;

    @FindBy(id = "password")
    WebElement Bypassword;

    @FindBy(id = "login")
    WebElement submit;

    @FindBy(id = "output")
    WebElement output;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public String ValidateLoginPageTitle() {
        return driver.getTitle();
    }

    public void login(String username, String password) throws InterruptedException {
        Byusername.sendKeys(username);
        Bypassword.sendKeys(password);
        submit.click();
        Thread.sleep(1000);

    }

    public void refresh(){
        driver.navigate().refresh();
    }

    public String InvalidOutput() {
        return output.getText();
    }

    public void ClearField() throws InterruptedException {
        Byusername.clear();
        Bypassword.clear();
        Thread.sleep(1000);
    }


}
