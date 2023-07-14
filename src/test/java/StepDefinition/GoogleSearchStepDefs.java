//package StepDefinition;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.util.concurrent.TimeUnit;
//
//public class GoogleSearchStepDefs {
//    WebDriver driver = null;
//
//    @Given("browser is open")
//    public void browserIsOpen() {
//        System.out.println("Inside Step - browser is open");
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--remote-allow-origins=*");
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver(options);
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//
//    }
//
//    @And("user is on the google search page")
//    public void userIsOnTheGoogleSearchPage() {
//        System.out.println("Inside Step - user is on the google search page");
//    }
//
//    @When("user enters a text in search box")
//    public void userEntersATextInSearchBox() {
//        System.out.println("Inside Step - user enters a text in search box");
//    }
//
//    @And("hits enter")
//    public void hitsEnter() {
//        System.out.println("Inside Step - hits enter");
//    }
//
//    @Then("user is navigated to search results")
//    public void userIsNavigatedToSearchResults() {
//        System.out.println("Inside Step - user is navigated to search results");
//    }
//}
