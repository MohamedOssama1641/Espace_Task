package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private static final int DEFAULT_TIMEOUT = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
    }

    protected WebElement waitForElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected WebElement waitForClickableElement(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void clickElement(By locator) {
        waitForClickableElement(locator).click();
    }

    protected String getElementText(By locator) {
        return waitForElement(locator).getText();
    }

    protected void enterText(By locator, String text) {
        WebElement element = waitForElement(locator);
        element.clear();
        element.sendKeys(text);
    }
}