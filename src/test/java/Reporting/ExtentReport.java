package Reporting;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.BaseTest;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class ExtentReport extends BaseTest {

    public static ExtentReports extent;
    public static ExtentTest test;
    private static ExtentSparkReporter spark;
    static String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    static String FileReporter ="C:/Users/digilink/Downloads/SeleniumRevision/LearningCucumber/src/test/java/Reporting/spark_" +timeStamp +".html";
    static WebDriver driver = BaseTest.driver;
    @BeforeSuite
    public static void initReports() {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(FileReporter);
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle(" Luma BDD Cucumber Report");
        spark.config().setReportName("Extent Reports");
        driver = BaseTest.driver;
    }

    public static ExtentTest createTest(String testcasename) {
        test = extent.createTest(testcasename);
        return test;
    }

    public static String getScreenshot(String testCaseName) throws IOException {
        File source = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String fileName = "image_" + testCaseName + "_" + timestamp + ".png";
        String path = System.getProperty("user.dir") + "src/test/java/Reporting/Screenshots/" + fileName;
        FileUtils.copyFile(source, new File(path));
        return path;
    }

    @AfterSuite
    public static void flushReports() throws IOException {
        extent.flush();
        Desktop.getDesktop().browse(new File(FileReporter).toURI());
    }
}
