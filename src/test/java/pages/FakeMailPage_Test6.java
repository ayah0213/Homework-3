package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FakeMailPage_Test6 extends PageBase {

    @FindBy(className = "animace")
    private WebElement emailElement;

    public String emailTextFromFakemail() {
      return emailElement.getText();
    }
}