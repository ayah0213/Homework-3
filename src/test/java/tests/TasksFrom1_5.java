package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FakeMailPage_Test6;
import pages.FileUpload_Test7;
import pages.RegisFormWrongDOBPage;
import pages.SignUpForMailingListPage;
import utilities.BrowserUtilities;


public class TasksFrom1_5 extends TestBase {

    RegisFormWrongDOBPage registrationFormPage = new RegisFormWrongDOBPage();
    BrowserUtilities browserUtilities = new BrowserUtilities();


    @Test(testName = "Test Case #1", priority = 1, description = "https://practice-cybertekschool.herokuapp.com/")
    public void wrongDOB() throws InterruptedException {
        registrationFormPage.clickOnRegistrationFormLink();
        registrationFormPage.typeDOB();
        Thread.sleep(3000);
        //                    actual                                   expected
        Assert.assertEquals(registrationFormPage.message(), "The date of birth is not valid");
        Assert.assertTrue(registrationFormPage.messageIsDisplayed());
        Thread.sleep(3000);
    }

    @Test(testName = "Test Case #2", priority = 2, description = "https://practice-cybertekschool.herokuapp.com/")
    public void languagesAreDisplayed() throws InterruptedException {
        registrationFormPage.clickOnRegistrationFormLink();
        registrationFormPage.programmLanguagesIsDisplayed();
        Thread.sleep(3000);
    }

    @Test(testName = "Test Case #3", priority = 3, description = "https://practice-cybertekschool.herokuapp.com/")
    public void onlyOneLetterErrorIsDisplayed() throws InterruptedException {
        registrationFormPage.clickOnRegistrationFormLink();
        registrationFormPage.typeOneLetterToFistNameAndCheckIsDisplayed();
        Thread.sleep(3000);
    }

    @Test(testName = "Test Case #4", priority = 4, description = "https://practice-cybertekschool.herokuapp.com/")
    public void lastNamee() {
        registrationFormPage.lastNAMEMEthod1();
    }


    @Test(testName = "Test Case #5", priority = 5, description = "https://practice-cybertekschool.herokuapp.com/")
    public void fullRegistration() throws InterruptedException {
        registrationFormPage.clickOnRegistrationFormLink();
        Thread.sleep(3000);
        registrationFormPage.fullRegistration();
        Thread.sleep(3000);
    }

    @Test(testName = "Test Case #6", priority =6, description = "https://www.tempmailaddress.com/")
    public void fakeMail() throws InterruptedException {
        String strEmail = "https://www.tempmailaddress.com/";
        FakeMailPage_Test6 fakeEmail = new FakeMailPage_Test6();
        String email = fakeEmail.emailTextFromFakemail();
        browserUtilities.navigateUrl("https://practice-cybertekschool.herokuapp.com/");

        SignUpForMailingListPage MailingListPAge = new SignUpForMailingListPage();
        MailingListPAge.clickSignUpMailinListMethod();
        Thread.sleep(3000);
        MailingListPAge.emailInputElement.sendKeys(email);
        MailingListPAge.validNameEnterMethod();
        MailingListPAge.signUpButtonMaiListMethod();
        Thread.sleep(3000);
        MailingListPAge.successMessageMethod();
        browserUtilities.navigateUrl(strEmail);
        MailingListPAge.verifyEmailFromCybertekcAmeFromMethod();
        MailingListPAge.mailingLetterMethodClick();
        Thread.sleep(3000);
        MailingListPAge.verifyReplyMsgMethod();
        MailingListPAge.verifySubjectThannksMethod();

    }

    @Test(testName = "Test Case #7", priority = 7, description = "https://practice-cybertekschool.herokuapp.com/")
    public void task7() throws InterruptedException {
        FileUpload_Test7 fileUploadPage = new   FileUpload_Test7();
        fileUploadPage.clickOnFileUploadLink();
        fileUploadPage.UploadFile();
        fileUploadPage.clickUploadFileButtonAndVerifyTextAndNameFileTextIsDisplayed();
    }



}