package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Pages.BasePage {
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By login = By.id("login-button");
    private By ConfLog = By.cssSelector(".login_logo");

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    /**
     * this method to enter username
     * @param text
     */
    public void EnterUsername(String text){
        enterText(username,text);
    }

    /**
     * this method to enter password
     * @param text
     */
    public void EnterPassword(String text){
        enterText(password,text);
    }

    /**
     * this method to press login
     * @return
     */
    public mainpage clickLogin(){
        clickElement(login);
        return new mainpage(driver);
    }

    /**
     * to confirm logout
     * @return
     */
    public String ConfLogout(){
        return getElementText(ConfLog);
    }

}
