package pageObject;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.io.IOException;

import static Reporting.ExtentReport.getScreenshot;
import static Reporting.ExtentReport.test;

public class Login {
    WebDriver driver = BaseTest.driver;
    public static void LogIn(String Email, String password) throws IOException {

        test.info("User entered correct credentials");
        BaseTest.driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();

        WebElement emailInput = BaseTest.driver.findElement(By.id("email"));
        emailInput.sendKeys(Email);

        WebElement passwordInput = BaseTest.driver.findElement(By.xpath("(//input[@id='pass'])[1]"));
        passwordInput.sendKeys(password);
        test.info("Value entered", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot("Sign In")).build());

        BaseTest.driver.findElement(By.xpath("(//span[contains(text(),'Sign In')])[1]")).click();


    }

    public static void goTo(){
        BaseTest.driver.findElement(By.xpath("(//img)[1]")).click();
    }


}


