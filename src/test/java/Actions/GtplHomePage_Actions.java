package Actions;

import org.openqa.selenium.WebDriver;

import Hooks.Hooks;
import Pages.GtplHomePage;

public class GtplHomePage_Actions {

    WebDriver driver;
    GtplHomePage gtplHomePage;

    public GtplHomePage_Actions() {
        this.driver = Hooks.getDriver();
        this.gtplHomePage = new GtplHomePage(driver);
    }

   

    public void enterUserID(String userId) {
        gtplHomePage.userId.sendKeys(userId);
    }

    public void enterPassword(String password) {
        gtplHomePage.password.sendKeys(password);
    }

    public void clickLogin() {
        gtplHomePage.loginBtn.click();
    }
}
