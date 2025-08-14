package RemoveBath;

import Base.base;
import Pages.Cart;
import Pages.mainpage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckRemove extends base {
    @Test
    public void Testing(){
        SoftAssert softAssert = new SoftAssert();
        loginPage.EnterUsername("standard_user");
        loginPage.EnterPassword("secret_sauce");
        mainpage page =loginPage.clickLogin();
        for (int i = 1; i<=3 ; i++){
            page.AddPro();
        }
        softAssert.assertEquals(page.ConfirmAdd(),"3");
        page.RemoveProduct();
        softAssert.assertEquals(page.ConfirmAdd(),"2");
        Cart cart = page.ClickCart();
        cart.RemoveSecound();
        softAssert.assertEquals(cart.confirmRemove(),"1");
    }
}
