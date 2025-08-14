package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainpage extends Pages.BasePage {
    WebDriver driver;
    private By logInConf = By.cssSelector(".title");
    private By Products = By.cssSelector(".btn.btn_primary.btn_small.btn_inventory\n");
    private By AddConf = By.cssSelector(".shopping_cart_badge");
    private By RemovePro = By.cssSelector(".btn.btn_secondary.btn_small.btn_inventory\n");
    private By GoCart = By.cssSelector(".shopping_cart_link");
    private By MinMenu = By.id("react-burger-menu-btn");
    private By LogOut = By.id("logout_sidebar_link");


    public mainpage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    /**
     * to confirm that the page login
     * @return
     */
    public String ConfirmLogin(){
        return getElementText(logInConf);
    }

    /**
     * Adding items to the cart
     */
    public void AddPro(){
        clickElement(Products);
    }

    /**
     * to confirm adding
     * @return
     */
    public String ConfirmAdd(){
        return getElementText(AddConf);
    }

    /**
     * to remove item from main page
      */
    public void RemoveProduct(){
        clickElement(RemovePro);
    }

    /**
     * move to Cart
     * @return
     */
    public Cart ClickCart(){
        clickElement(GoCart);
        return new Cart(driver);
    }

    /**
     * to logout
     * @return
     */
    public LoginPage clicklogout(){
        clickElement(MinMenu);
        clickElement(LogOut);
        return new LoginPage(driver);
    }


}
