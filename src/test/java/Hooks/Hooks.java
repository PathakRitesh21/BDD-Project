package Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    public static WebDriver driver;

    @Before(order =0 )
    public void setUp() {
        // ✅ WebDriverManager handles the driver binary setup automatically
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("✅ Setup Completed Successfully");
    }

    @After(order = 0)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("🧹 TearDown Completed Successfully");
        }
    }

    public static WebDriver getDriver() {
    	System.out.println("✅ Setup Completed Successfully" + driver);
        return driver;
        
    }
}
