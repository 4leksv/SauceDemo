package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By alertMessage = By.className("error-message-container");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public InventoryPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new InventoryPage(driver);
    }
    public String getAlertText() {
        return driver.findElement(alertMessage).getText();
    }
}
