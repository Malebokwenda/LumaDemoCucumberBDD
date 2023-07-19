package utilities;

import org.openqa.selenium.WebDriver;
import pageObject.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {

    private final ExcelReader excelData;
    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public BaseTest basetest;

    public TestContextSetup() throws IOException {
        basetest = new BaseTest();
        driver = basetest.setupBrowser(); // Set up the WebDriver here
        pageObjectManager = new PageObjectManager(driver);
        excelData = new ExcelReader();
        ExcelReader.setupExcel();
    }
}
