package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.Login;
import utilities.BaseTest;

public class TeesSteps  extends BaseTest {
    WebDriver driver = BaseTest.driver;
    @Given("user is on Home page")
    public void user_is_on_home_page() {
        System.out.println("Inside Step - user enters a text in search box");
        Login.goTo();
    }

    @When("user navigate to {string} category")
    public void user_navigate_to_category(String string) {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("user select {string} subcategory")
    public void user_select_subcategory(String string) {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("user choose {string} subcategory")
    public void user_choose_subcategory(String string) {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("user add a {int} stars product to the cart without selecting size and color")
    public void user_add_a_stars_product_to_the_cart_without_selecting_size_and_color(Integer int1) {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @Then("user should see the error message {string}")
    public void user_should_see_the_error_message(String string) {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("user search for {string}")
    public void user_search_for(String string) {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("user select any size from the available options")
    public void user_select_any_size_from_the_available_options() {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("user add the hoodie to my cart")
    public void user_add_the_hoodie_to_my_cart() {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("user proceed to checkout")
    public void user_proceed_to_checkout() {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @When("user provide my details for completing the order")
    public void user_provide_my_details_for_completing_the_order() {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @Then("user should see a confirmation message for the successful order")
    public void user_should_see_a_confirmation_message_for_the_successful_order() {
        System.out.println("Inside Step - user enters a text in search box");
    }
}
