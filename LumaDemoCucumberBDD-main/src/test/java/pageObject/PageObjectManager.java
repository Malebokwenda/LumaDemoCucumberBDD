package pageObject;

import org.openqa.selenium.WebDriver;
import pageObject.*;

public class PageObjectManager {
    public WebDriver driver;
    public Login login;
    public CompareProducts compareProducts;
    public Tees tees;
    public Cart cart;

    public Checkout checkout;
    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public Login getLogin(){
        login = new Login(driver);
        return login;
    }
    public Cart getCart(){
        cart = new Cart(driver);
        return cart;
    }
    public Tees getTees(){
        tees = new Tees(driver);
        return tees;
    }
    public CompareProducts getCompareProducts(){
        compareProducts = new CompareProducts(driver);
        return compareProducts;
    }
    public Checkout getCheckout(){
        checkout = new Checkout(driver);
        return checkout;
    }
}
