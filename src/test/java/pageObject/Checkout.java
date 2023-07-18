package pageObject;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseTest;
import Reporting.ExtentReport;

import java.io.IOException;
import java.time.Duration;

import static Reporting.ExtentReport.getScreenshot;

public class Checkout {
    WebDriver driver = BaseTest.driver;
    static WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(10));


    public static void captureShippingInfo(String FirstName, String LastName, String SCompany, String SCountry, String SAddress, String SCity, String SProvince, String SCode, String SPhone) throws IOException {
        ExtentReport.test.info("User is filling shipping information");
//        Fill in personal info
        WebElement firstNameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@name, \"firstname\")]")));
        firstNameInput.clear();
        firstNameInput.sendKeys(FirstName);

        WebElement lastNameInput = BaseTest.driver.findElement(By.name("lastname"));
        lastNameInput.clear();
        lastNameInput.sendKeys(LastName);


        WebElement companyInput = BaseTest.driver.findElement(By.name("company"));
        companyInput.clear();
        companyInput.sendKeys(SCompany);

//        address
        WebElement addressInput = BaseTest.driver.findElement(By.name("street[0]"));
        addressInput.clear();
        addressInput.sendKeys(SAddress);

        WebElement cityInput = BaseTest.driver.findElement(By.name("city"));
        cityInput.clear();
        cityInput.sendKeys(SCity);
        ExtentReport.test.info("Value entered", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot("Shipping Info1")).build());


//        Select country
        WebElement  countryDropdown = wait.until(ExpectedConditions.presenceOfElementLocated
                (By.xpath("//*[@id=\"KXK8X9A\"]")));
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText(SCountry);


//        province
        WebElement  provinceInput = BaseTest.driver.findElement(By.name("region"));
        provinceInput.sendKeys(SProvince);


//      postal code
        WebElement zipInput = BaseTest.driver.findElement(By.name("postcode"));
        zipInput.clear();
        zipInput.sendKeys(SCode);


//      cellphone
        WebElement cellNumberInput = BaseTest.driver.findElement(By.name("telephone"));
        cellNumberInput.clear();
        cellNumberInput.sendKeys(SPhone);

//        shipping method
        WebElement shippingMethod= wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("(//input[@name='ko_unique_2'])[1]")));
        Actions actions = new Actions(BaseTest.driver);
        actions.moveToElement(shippingMethod).click().perform();

        BaseTest.driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();
        ExtentReport.test.info("Value entered", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot("Shipping Info")).build());
//        place order
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='primary'])[3]"))).click();


    }
}


