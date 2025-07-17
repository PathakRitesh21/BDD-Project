package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GtplHomePage {

    WebDriver driver;

    public GtplHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "uid")
    public WebElement userId;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "btnLogin")
    public WebElement loginBtn;
}
