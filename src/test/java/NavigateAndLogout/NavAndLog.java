package NavigateAndLogout;

import Base.base;
import Pages.Cart;
import Pages.LoginPage;
import Pages.mainpage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NavAndLog extends base {
    @Test
    public void checking(){
        SoftAssert softAssert = new SoftAssert();
        loginPage.EnterUsername("standard_user");
        loginPage.EnterPassword("secret_sauce");
        mainpage page =loginPage.clickLogin();
        for (int i = 1; i<=3 ; i++){
            page.AddPro();
        }
        Cart cart = page.ClickCart();
        softAssert.assertEquals(cart.confirmRemove(),"3","error 1");
        mainpage page2 = cart.navigatback();
        LoginPage page3 = page2.clicklogout();
        softAssert.assertEquals(page3.ConfLogout(),"Swag Labs","error 3");
    }
}
