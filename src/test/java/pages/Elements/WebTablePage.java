package pages.Elements;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage extends TestBase {


    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Web Tables']")
    WebElement By_Accordion_Web_Table;
    @FindBy(id = "addNewRecordButton")
    WebElement By_click_add_record;


    @FindBy(id = "firstName")
    WebElement By_Firstname;
    @FindBy(id = "lastName")
    WebElement By_Lastname;
    @FindBy(id = "userEmail")
    WebElement By_UserEmail;
    @FindBy(id = "age")
    WebElement By_Age;
    @FindBy(id = "salary")
    WebElement By_Salary;
    @FindBy(id = "department")
    WebElement By_Department;

    @FindBy(id = "submit")
    WebElement By_Submit;

    public WebTablePage() {
        PageFactory.initElements(driver, this);
    }


    public void SelectWebTableFromAccordion() {
        By_Accordion_Web_Table.click();
    }

    public void ClickAddNewRecordBtn() {
        By_click_add_record.click();
    }


 public void EnterNewRecordDetail(String firstname, String lastname, String email, String age, String salary, String department){
        By_Firstname.sendKeys(firstname);
        By_Lastname.sendKeys(lastname);
        By_UserEmail.sendKeys(email);
        By_Age.sendKeys(age);
        By_Salary.sendKeys(salary);
        By_Department.sendKeys(department);

 }
 public void ClickSubmitForAddNewRecord() throws InterruptedException {
        By_Submit.click();
//        Thread.sleep(1000);
 }


}
