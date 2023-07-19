//package StepDefinition;
//
//import Reporting.ExtentReport;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObject.Login;
//import utilities.BaseTest;
//import utilities.ExcelReader;
//import utilities.TestContextSetup;
//
//import java.io.IOException;
//
//import static Reporting.ExtentReport.extent;
//
//public class junk {
//    import Reporting.ExtentReport;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import org.openqa.selenium.WebDriver;
//import pageObject.Login;
//import utilities.BaseTest;
//import utilities.ExcelReader;
//import utilities.TestContextSetup;
//
//import static Reporting.ExtentReport.extent;
//
//import java.io.IOException;
//
//    public class LoginSteps extends BaseTest {
//        private Login login;
//
//        public LoginSteps(TestContextSetup testContextSetup) {
//            this.login = testContextSetup.pageObjectManager.getLogin();
//        }
//
//        @Given("user am on the login page")
//        public void user_am_on_the_login_page() {
//            // WebDriver instance is maintained in the BaseTest class.
//            // Use it to navigate to the login page.
//            driver.get("https://magento.softwaretestingboard.com");
//        }
//
//        @When("user enter a correct username and a correct password")
//        public void user_enter_a_correct_username_and_a_correct_password() throws IOException {
//            ExtentReport.test = extent.createTest("Sign In");
//            String email = ExcelReader.getCellData(1, 3);
//            String password = ExcelReader.getCellData(1, 4);
//            Login.LogIn(email, password); // Use the login instance created in the constructor.
//        }
//
//        @When("clicks the login button")
//        public void clicks_the_login_button() {
//            Login.clickLoginButton(); // Use the login instance created in the constructor.
//        }
//
//        @Then("user should be logged in to my account")
//        public void user_should_be_logged_in_to_my_account() {
//            Login.goTo(); // Use the login instance created in the constructor.
//        }
//    }
//
//}
