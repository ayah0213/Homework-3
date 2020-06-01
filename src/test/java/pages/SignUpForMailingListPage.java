package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignUpForMailingListPage extends PageBase {

    @FindBy(linkText = "Sign Up For Mailing List")
    private WebElement clickForSignUpButton;

    public void clickSignUpMailinListMethod() {
        clickForSignUpButton.click();
    }

    @FindBy(name = "full_name")
    private WebElement validNAmeElement;


    @FindBy(xpath = "//input[@type ='email']")
   public WebElement emailInputElement;

    @FindBy(name = "wooden_spoon")
    private WebElement signUpbuttonMailList;

    @FindBy(name = "signup_message")
    private WebElement succesfullySinUPMEsgElement;


    @FindBy(xpath = "//tbody[@id='schranka']//tr//td[1][contains(text(), 'do-not-reply@practice.cybertekschool.com')]")
    private WebElement emailFromCybertek;


    @FindBy(id="odesilatel")
    private WebElement verifyReplyMsgElement;

    @FindBy(id = "predmet")
    private WebElement subjectTahnksElement;

    public void verifySubjectThannksMethod(){
        Assert.assertEquals(subjectTahnksElement.getText(),"Thanks for subscribing to practice.cybertekschool.com!");
    }

    public  void verifyReplyMsgMethod(){
        Assert.assertEquals(verifyReplyMsgElement.getText(),"do-not-reply@practice.cybertekschool.com");
    }

    public void verifyEmailFromCybertekcAmeFromMethod(){
        Assert.assertEquals(emailFromCybertek.getText(), " do-not-reply@practice.cybertekschool.com");
    }


    public void mailingLetterMethodClick(){
        emailFromCybertek.click();
    }

    public void successMessageMethod(){

        // optional
        Assert.assertEquals(succesfullySinUPMEsgElement.getText(), "Thank you for signing up. Click the button below to return to the home page.");

        // if the text is displayed (successMessageElement.isDisplayed()) it will return true -->true means YES it is displayed
        // successMessageElement.isDisplayed() -->return false--> it means NO it is not displayed
        Assert.assertTrue(succesfullySinUPMEsgElement.isDisplayed());

    }


    public void signUpButtonMaiListMethod(){
        signUpbuttonMailList.click();
    }


    public void validNameEnterMethod() {
        validNAmeElement.sendKeys("Ayjeren");
    }

}



