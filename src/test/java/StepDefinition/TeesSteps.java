package StepDefinition;

import Reporting.ExtentReport;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.*;
import utilities.BaseTest;
import utilities.ExcelReader;

import java.io.IOException;

import static Reporting.ExtentReport.extent;

public class TeesSteps  extends BaseTest {
    WebDriver driver = BaseTest.driver;
    @Given("user is on Home page")
    public void user_is_on_home_page() {
        Login.goTo();
    }
    @When("user navigate to Men category")
    public void user_navigate_to_men_category() throws IOException, InterruptedException {
        ExtentReport.test = extent.createTest("Three Stars Tee");

        Tees.navigateToTopsTees();
    }
    @When("user select Tops subcategory")
    public void user_select_tops_subcategory() throws InterruptedException {
        Tees.hoverOnTops();
    }

    @When("user choose Tees subcategory")
    public void user_choose_tees_subcategory() {
      Tees.clicksTee();
    }
    @When("user add a three stars product to the cart without selecting size and color")
    public void user_add_a_three_stars_product_to_the_cart_without_selecting_size_and_color() throws IOException {
        Tees.selectThreeStarsTee();
        Cart.threeStarsAddToCart();
    }
    @Then("user should see the error message")
    public void user_should_see_the_error_message() throws IOException {
        Validation.EmptyFields();
    }

//    search for miko pullover
    @When("user search for {string}")
    public void user_search_for(String  productName) throws IOException, InterruptedException {
        ExtentReport.test = extent.createTest("Search for item");
        productName = ExcelReader.getCellData(1,5);
        Tees.searchForItem(productName);
    }

    @When("user select any size from the available options")
    public void user_select_any_size_from_the_available_options() {
        Tees.scrollToMikoPullover();
        Tees.pullOverItem();
    }

    @When("user add the hoodie to my cart")
    public void user_add_the_hoodie_to_my_cart() {
        Cart.addPulloverToCart();
        Validation.itemAddedToCart();
    }

    @When("user proceed to checkout")
    public void user_proceed_to_checkout( ) throws IOException {
        Cart.clickCartIcon();
    }

    @When("user provide my details for completing the order")
    public void user_provide_my_details_for_completing_the_order(String FirstName,String LastName,String  SCompany, String SCountry, String
            SAddress, String SCity, String  SProvince, String   SCode, String SPhone) throws IOException {
        FirstName = ExcelReader.getCellData(1,1);
        LastName = ExcelReader.getCellData(1,2);
        SCompany = ExcelReader.getCellData(1,8);
        SCountry = ExcelReader.getCellData(1,9);
        SAddress =  ExcelReader.getCellData(1,10);
        SCity =  ExcelReader.getCellData(1,11);
        SProvince = ExcelReader.getCellData(1,12);
        SCode= String.valueOf(ExcelReader.getCellInt(1,13));
        SPhone =String.valueOf(ExcelReader.getCellInt(1,14));
        Checkout.captureShippingInfo( FirstName,LastName,  SCompany,  SCountry,  SAddress, SCity,  SProvince,  SCode,SPhone);
    }

    @Then("user should see a confirmation message for the successful order")
    public void user_should_see_a_confirmation_message_for_the_successful_order() {
        System.out.println("Inside Step - user enters a text in search box");
    }
}
