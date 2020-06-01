package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Driver {
    private static WebDriver driver;

    public Driver(){

    }

    //method returns driver
    public static WebDriver getDriver() {
        if (driver == null) {
            //switch statement(browser value from configs)
            String browser = ConfigurationReader.getProperty("browser");//if browser value from configs equals to chrome
            if ("chrome".equals(browser)) {//setting up chrome driver in pc
                WebDriverManager.chromedriver().setup();
                //initializing driver
                driver = new ChromeDriver();

                //if browser value from configs equals to firefox
            } else if ("firefox".equals(browser)) {//setting up firefox driver in pc
                WebDriverManager.firefoxdriver().setup();
                //initializing driver
                driver = new FirefoxDriver();

                //if browser value from configs equals to ie(internet explorer)
            } else if ("ie".equals(browser)) {//setting up internet explorer driver in pc
                WebDriverManager.iedriver().setup();
                //initializing driver
                driver = new InternetExplorerDriver();
            }
        }
        return driver;
    }


    //close driver and make it equal to null
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}