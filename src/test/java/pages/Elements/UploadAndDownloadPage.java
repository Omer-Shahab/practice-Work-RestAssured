package pages.Elements;

import TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadAndDownloadPage extends TestBase {


    @FindBy(xpath = "//span[contains(@class,'text')and normalize-space(text())='Upload and Download']")
    WebElement By_Accordion_Upload_Download;

    @FindBy(id = "uploadFile")
    WebElement By_Upload;
    @FindBy(id = "downloadButton")
    WebElement By_Download;


    JavascriptExecutor js = (JavascriptExecutor) driver;

    public UploadAndDownloadPage() {
        PageFactory.initElements(driver, this);
    }


    public void SelectUploadAndDownloadFromAccordion() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", By_Accordion_Upload_Download);
        Thread.sleep(2000);
        By_Accordion_Upload_Download.click();
//        By_Accordion_Upload_Download.click();
    }

    public void UploadPic() throws InterruptedException {
        By_Upload.sendKeys("/Users/smomer/Desktop/pt.png");
            Thread.sleep(1000);
    }

    public void ClickOnDownload() throws InterruptedException {
        By_Download.click();
        Thread.sleep(2000);

    }

}
