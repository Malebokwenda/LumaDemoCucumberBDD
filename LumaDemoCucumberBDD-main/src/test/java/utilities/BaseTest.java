package utilities;

import Reporting.ExtentReport;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest {

    public static WebDriver driver;
    TestContextSetup testContextSetup;
    private ExcelReader excelData;

    @BeforeSuite
    public static void beforeSuite() {
        ExtentReport.initReports();
    }

    @AfterSuite
    public static void afterSuite() throws IOException {
        ExtentReport.flushReports();
    }

    @AfterMethod
    public  void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            ExtentReport.test.log(Status.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            ExtentReport.test.log(Status.PASS, result.getTestName());
            System.out.println("Test Passed");
        } else {
            ExtentReport.test.log(Status.SKIP, result.getTestName());
        }
    }


        public WebDriver setupBrowser(){
            String browser = "chrome";
            String url = "https://magento.softwaretestingboard.com";

            if(driver == null){
                switch (browser.toUpperCase()){
                    case "CHROME", "GOOGLE CHROME" ->{
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.get(url);
                        driver.manage().window().maximize();
                    }
                    case "EDGE", "MICROSOFT EDGE" ->{
                        WebDriverManager.edgedriver().setup();
                        driver = new EdgeDriver();
                        driver.get(url);
                        driver.manage().window().maximize();
                    }
                }
            }

            return driver;
        }

        @AfterClass
        public void tearDown() {
            //driver.quit();
        }



//    @Parameters({"browser","url"})
//    @BeforeClass
//    public void setUp(String browser, String url ) throws IOException {
//        if (browser.equalsIgnoreCase("chrome")) {
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--remote-allow-origins=*");
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver(options);
//            driver.manage().window().maximize();
//
//
//        } else if (browser.equalsIgnoreCase("edge")) {
//            WebDriverManager.edgedriver().setup();
//            EdgeOptions options = new EdgeOptions();
//            driver = new EdgeDriver(options);
//
//        } else {
//            throw new IllegalArgumentException("Invalid browser name: " + browser);
//        }
//        driver.manage().window().maximize();
//        driver.get("https://magento.softwaretestingboard.com ");
//
//        excelData = new ExcelReader();
//        ExcelReader.setupExcel();
//    }
//
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
}
