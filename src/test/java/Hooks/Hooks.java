package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    public static WebDriver driver;

    @Before(order =0 )
    public void setUp() {
        // ✅ WebDriverManager handles the driver binary setup automatically
        WebDriverManager.chromedriver().clearResolutionCache().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("✅ Setup Completed Successfully");
    }

    @After(order = 0)
    public void tearDown(Scenario scenario) {
    	if (scenario.isFailed()) {
            // Take screenshot and attach it to report
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed_Scenario_Screenshot");
    	}
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
