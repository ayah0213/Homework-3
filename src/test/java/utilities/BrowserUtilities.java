package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class BrowserUtilities {

    // common methods of Thread.sleep

    private WebDriver driver = Driver.getDriver();

    // wait in seconds
    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // this method will navigate to the url which I will type
    public void navigateUrl(String url){
        Driver.getDriver().navigate().to(url);
    }




    //screenshot method
    public static String takeScreenshot(String nameOfScreenshot){

        nameOfScreenshot = new Date().toString().replace(":","_")+"_"+nameOfScreenshot;

        String path = System.getProperty("user.dir")+"/test-output/screenshots/"+nameOfScreenshot+".png";
        TakesScreenshot takesScreenshot= (TakesScreenshot) Driver.getDriver();
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(path);
        try {
            FileUtils.copyFile(source,destination);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path;

    }



}

