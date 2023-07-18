package pageObject;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;
import Reporting.ExtentReport;

import java.io.IOException;

import static Reporting.ExtentReport.getScreenshot;

public class Cart {
    WebDriver driver = BaseTest.driver;

    public static void threeStarsAddToCart() throws IOException {
        BaseTest.driver.findElement(By.xpath("(//button[@id='product-addtocart-button'])[1]")).click();
    }
    public static void addPulloverToCart(){
        BaseTest.driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[1]")).click();

    }
    public static void clickCartIcon(){
        BaseTest.driver.findElement(By.xpath("(//a[@class='action showcart'])[1]")).click();
        Actions actions = new Actions(BaseTest.driver);

        WebElement proceedToCheckout = BaseTest.driver.findElement(By.cssSelector("#top-cart-btn-checkout"));
        actions.moveToElement(proceedToCheckout).click().perform();

    }
    public static  void heroHoodieCartButton() throws IOException {
        ExtentReport.test.info("Value entered", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot("Hero Hoodie")).build());
        BaseTest.driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div/div/div[3]/div/div[1]/form/button")).click();

    }

}
