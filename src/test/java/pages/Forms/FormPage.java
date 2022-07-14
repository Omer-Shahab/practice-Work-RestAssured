package pages.Forms;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class FormPage extends TestBase {

    @FindBy(xpath = "//div[contains(@class,'header-text')and normalize-space(text())='Forms']")
    WebElement By_Forms;

    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Practice Form']")
    WebElement By_PracticeForms;
    @FindBy(id = "firstName")
    WebElement By_First_Name;

    @FindBy(id = "lastName")
    WebElement By_Last_Name;

    @FindBy(id = "userEmail")
    WebElement By_User_Email;

    @FindBy(xpath = "//label[contains(@class,'custom-control-label')and normalize-space(text())='Male']")
    WebElement By_Radio;
    @FindBy(tagName = "html")
    WebElement ht;
    @FindBy(id = "userNumber")
    WebElement By_Number;

    @FindBy(id = "subjectsInput")
    WebElement By_Subject;

    @FindBy(xpath = "//label[contains(text(),'Reading')]")
    WebElement By_Checkbox;

    @FindBy(id = "uploadPicture")
    WebElement By_Upload;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement By_CurrentAddress;

    @FindBy(xpath = "//div[contains(text(),'Select State')]")
    WebElement By_State;

    @FindBy(xpath = "//div[contains(text(),'Haryana')]")
    WebElement By_StateHaryana;

    @FindBy(xpath = "//div[contains(text(),'Select City')]")
    WebElement By_City;

    @FindBy(xpath = "//div[contains(text(),'Karnal')]")
    WebElement By_CityKarnal;
    @FindBy(id = "submit")
    WebElement By_Sub;

    @FindBy(id = "dateOfBirthInput")
    WebElement By_DOB;
    @FindBy(className = "react-datepicker__month-select")
    WebElement By_Month;
    @FindBy(xpath = "//option[@value='2']")
    WebElement By_March;

    @FindBy(className = "react-datepicker__year-select")
    WebElement By_Year;
    @FindBy(xpath = "//option[@value='1997']")
    WebElement By_1997;

    @FindBy(xpath = "////div[@aria-label='Choose Tuesday, March 11th, 1997']")
    WebElement date;

    public FormPage() {
        PageFactory.initElements(driver, this);
    }

    public void ClickForms() {


        js.executeScript("arguments[0].scrollIntoView();", By_Forms);
       By_Forms.click();
    }

    public void SelectPracticeForm() {
        js.executeScript("arguments[0].scrollIntoView();", By_PracticeForms);
        By_PracticeForms.click();
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions actions = new Actions(driver);
    public void FillPracticeForm(String Firstname, String Lastname, String Email, String MobileNumber, String Subject, String Current_Address, String Karnal) throws InterruptedException {

//        Robot robot = new Robot();
//
//        for (int i = 0; i < 5; i++) {
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_SUBTRACT);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//        }

        By_First_Name.sendKeys(Firstname);
        By_Last_Name.sendKeys(Lastname);
        By_User_Email.sendKeys(Email);
       By_Radio.click();
        By_Number.sendKeys(MobileNumber);

//
//        By_DOB.click();
//        By_Month.click();
//        By_March.click();
//        By_Year.click();
//        By_1997.sendKeys(Keys.ENTER);
//
//        date.sendKeys(Keys.ENTER);
//        Thread.sleep(4000);
////
////        Thread.sleep(1000);



        By_Subject.sendKeys(Subject);
        By_Subject.sendKeys(Keys.ENTER);
        By_Checkbox.click();
        By_Upload.sendKeys("/Users/smomer/Desktop/pt.png");
        By_CurrentAddress.sendKeys(Current_Address);
        js.executeScript("arguments[0].scrollIntoView();", By_State);
        By_State.click();
        js.executeScript("arguments[0].scrollIntoView();", By_StateHaryana);
        By_StateHaryana.click();
        js.executeScript("arguments[0].scrollIntoView();", By_City);
        By_City.click();
        js.executeScript("arguments[0].scrollIntoView();", By_CityKarnal);
        By_CityKarnal.click();
    }

    public void ClickSubmit() {
        js.executeScript("arguments[0].scrollIntoView();", By_Sub);
        By_Sub.sendKeys(Keys.ENTER);
    }



}