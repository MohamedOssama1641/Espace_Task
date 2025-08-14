package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart extends Pages.BasePage {
    private By RemovePro = By.cssSelector(".btn.btn_secondary.btn_small.cart_button\n");
    private By Conf = By.cssSelector(".shopping_cart_badge");

    public Cart(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    /**
     * remove item from cart
     */
    public void RemoveSecound(){
        clickElement(RemovePro);
    }

    /**
     * to make sure item is removed
     * @return
     */
    public String confirmRemove(){
        return getElementText(Conf);
    }

    /**
     * navigate back to main page
     * @return
     */
    public mainpage navigatback(){
        driver.navigate().back();
        return new mainpage(driver);
    }
}
