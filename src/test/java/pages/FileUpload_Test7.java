package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUpload_Test7 extends PageBase {

    @FindBy(linkText = "File Upload")
    private WebElement goToFileUpload;

    @FindBy(id = "file-upload")
    private WebElement fileUPLOAD;

    @FindBy(id = "file-upload")
    private WebElement fileSubmitElement;

    @FindBy(tagName = "File Uploaded!")
    private WebElement fileUpploadedMsgElement;

    @FindBy(id = "uploaded-files ")
    private WebElement dispalyedAmamzonMsg;


    public void goToUploadFileMethod() {
        goToFileUpload.click();
    }


    public void fileSubmitMethod() {
        fileSubmitElement.click();
    }


    public void clickOnchooseFileButton() {
        fileUPLOAD.click();
        fileUPLOAD.sendKeys("C:\\Users\\Ayah\\Pictures\\Amazon.txt");

    }

    public void fileUplMessageMethod() {
        Assert.assertEquals(fileUpploadedMsgElement.getText(), "File Uploaded!");
        Assert.assertTrue(dispalyedAmamzonMsg.isDisplayed());

    }
}
