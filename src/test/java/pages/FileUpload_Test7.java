package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUpload_Test7 extends PageBase {

    // when you make variable or elements anything private it means
    // ENCAPSULATION

    @FindBy(linkText = "File Upload")
    private WebElement fileUploadLinkElement;

    @FindBy(id = "file-upload")
    private WebElement chooseFileElement;

    @FindBy(id = "file-submit")
    private WebElement uploadButtonElement;

    @FindBy(tagName = "h3")
    private WebElement fileUploadedTextElement;

    @FindBy(id = "uploaded-files")
    private WebElement uploadedFileNameElement;


    public void clickUploadFileButtonAndVerifyTextAndNameFileTextIsDisplayed() {
        uploadButtonElement.click();
        Assert.assertEquals(fileUploadedTextElement.getText(), "File Uploaded!");
        // when on the requirement it is asking is displayed we use AssertTrue or AssertFalse
        Assert.assertTrue(uploadedFileNameElement.isDisplayed());


        /*// this one is one way of verifying text
        if (fileUploadedTextElement.getText().equals("File Uploaded!")){
            System.out.println("File Uploaded! is displayed");
        } else {
            System.out.println("File Uploaded! NOT displayed");
        }
        // output/result if it is displayed it is gonna show this text "File Uploaded! is displayed"*/

    }

    public void UploadFile() throws InterruptedException {
        // I commented out this one because no need to click then send keys
        // chooseFileElement.click();
        Thread.sleep(3000);
        chooseFileElement.sendKeys("C:\\Users\\Ayah\\Desktop\\TMmap.txt");

    }


    public void clickOnFileUploadLink() {
        fileUploadLinkElement.click();
    }
}