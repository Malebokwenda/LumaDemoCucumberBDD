package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.BaseTest;

public class LoginSteps extends BaseTest {
    WebDriver driver = BaseTest.driver;
    @Given("user am on the login page")
    public void user_am_on_the_login_page() {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("user enter a correct username and a correct password")
    public void user_enter_a_correct_username_and_a_correct_password() {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @Then("user should be logged in to my account")
    public void user_should_be_logged_in_to_my_account() {
        System.out.println("Inside Step - user enters a text in search box");
    }

}
