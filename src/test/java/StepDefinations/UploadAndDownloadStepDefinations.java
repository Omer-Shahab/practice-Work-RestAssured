package StepDefinations;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Elements.ButtonsPage;
import pages.Elements.UploadAndDownloadPage;

public class UploadAndDownloadStepDefinations extends UploadAndDownloadPage {


    @Then("^User select upload and Download from accordion tab$")
    public void Select_Upload_And_Download_From_Accordion() throws InterruptedException {
        SelectUploadAndDownloadFromAccordion();
    }

    @Then("^User select Choose file and Upload$")
    public void Select_Upload_File() throws InterruptedException {
        UploadPic();
    }
    @Then("^Download the file$")
    public void Download_File() throws InterruptedException {
        ClickOnDownload();
        Thread.sleep(1000);
    }

}
