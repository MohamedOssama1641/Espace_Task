package CheckAddBath;

import Base.base;
import Pages.Cart;
import Pages.mainpage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class AddBath extends base{
    @Test
    public void Testing(){
        SoftAssert softAssert = new SoftAssert();
        loginPage.EnterUsername("standard_user");
        loginPage.EnterPassword("secret_sauce");
        mainpage page =loginPage.clickLogin();
        assertEquals(page.ConfirmLogin(),"Products");
        for (int i = 1; i<=3 ; i++){
            page.AddPro();
        }
        softAssert.assertEquals(page.ConfirmAdd(),"3");
        Cart cart = page.ClickCart();
        softAssert.assertEquals(cart.confirmRemove(),"Sauce Labs Backpack");
    }
}
