package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;

public class base {
    WebDriver driver;
    protected LoginPage loginPage;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        BasePoint();
        loginPage = new LoginPage(driver);
    }

    @BeforeMethod
    public void BasePoint(){
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void ending(){
        driver.quit();
    }

}
