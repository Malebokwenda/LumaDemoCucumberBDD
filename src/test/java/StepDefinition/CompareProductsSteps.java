package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.CompareProducts;
import pageObject.Validation;
import utilities.BaseTest;

import java.io.IOException;

public class CompareProductsSteps {

    WebDriver driver = BaseTest.driver;
    @When("user scrolls down to view products under Hot Sellers")
    public void user_scrolls_down_to_view_products_under_hot_sellers() {
       CompareProducts.scrollToHotSellers();
    }

    @When("user hover over the {string} to add to compare")
    public void user_hover_over_the_to_add_to_compare(String string) throws IOException, InterruptedException {
        CompareProducts.HoverToClickCompareIcon();
    }
    @When("user clicks on {string} to add to compare product")
    public void user_clicks_on_to_add_to_compare_product(String string) throws IOException, InterruptedException {
        CompareProducts.compareOnImgClicked();
    }
    @When("user clicks on the {string} to add product to compare product")
    public void user_clicks_on_the_to_add_product_to_compare_product(String string) {
        CompareProducts.weatherTankProduct();
    }
    @Then("user should see a confirmation message")
    public void user_should_see_a_confirmation_message() throws IOException {

    }

    @Then("user clicks on the comparison list link in the confirmation message")
    public void user_clicks_on_the_comparison_list_link_in_the_confirmation_message() {
        CompareProducts.compareListLink();
    }
    @When("user see a confirmation message")
    public void user_see_a_confirmation_message() throws IOException {
        Validation.compareSuccessText();

    }
    @Then("user should be redirected to the comparison list page")
    public void user_should_be_redirected_to_the_comparison_list_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks on the remove icon for {string}")
    public void user_clicks_on_the_remove_icon_for(String string) throws IOException, InterruptedException {
        CompareProducts.removeComparedItem();
    }

    @When("user select {string} from the confirmation alert")
    public void user_select_from_the_confirmation_alert(String string) throws InterruptedException {
        CompareProducts.okAlertButton();
    }

    @Then("the {string} should be successfully removed from the comparison list")
    public void the_should_be_successfully_removed_from_the_comparison_list(String string) throws IOException {
        Validation.removedItemText();
    }
}
