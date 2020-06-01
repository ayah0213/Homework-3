package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import utilities.Driver;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TestBase {


    protected WebDriver driver;
    protected Actions actions;

    @BeforeMethod(alwaysRun = true)
    public void setUp(Method method) {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(method.getAnnotation(Test.class).description());
    }

    @AfterTest(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }

}



//    // actual report
//    protected static ExtentReports extentReports;
//    // html file
//    protected ExtentHtmlReporter htmlReporter;
//    // each test (@Test -annotation) with details
//    protected ExtentTest extentTest;
//
//    @BeforeMethod
//    public void setUpMethod(){
//        Driver.getDriver().manage().window().maximize();
//        Driver.getDriver().manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
//        String URL = ConfigurationReader.getProperty("qa1");
//        Driver.getDriver().get(URL);
//
//    }
//
//    @AfterMethod
//    public void tearDown(ITestResult result) throws IOException {
//        // if result status is Failure
//        if (result.getStatus()==ITestResult.FAILURE ){
//            // getScreenshot method from BrowserUtilities
//            String screenshotPath = BrowserUtilities.takeScreenshot(result.getName());
//            // if test fails give me the name
//            extentTest.fail(result.getName());
//            extentTest.addScreenCaptureFromPath(screenshotPath,"FAILED" );
//            // print exception error if it has
//            extentTest.fail(result.getThrowable());
//        } else if(result.getStatus() == ITestResult.SKIP) {
//            extentTest.skip(result.getName());
//        }
//
//        // closing driver
//        Driver.closeDriver();
//    }

//    @BeforeTest
//    public void setUpTest(){
//        // we are creating new ExtentReports to use it's methods
//        extentReports = new ExtentReports();
//        // we are creating new ExtentHTMLReporter and we are setting up the location of html reporter
//        htmlReporter = new ExtentHtmlReporter("C:\\Users\\Ayah\\IdeaProjects\\CybertekHomework#3\\Ayah's_Test-Reports");
//        extentReports.attachReporter(htmlReporter);
//        // report Info setting up the name
//        htmlReporter.config().setReportName("Registration webpage test reports");
//    }
//
//    @AfterTest
//    public void tearDownTest() {
//        // flushing means closing like Driver.closeDriver();
//        extentReports.flush();
//    }
//


