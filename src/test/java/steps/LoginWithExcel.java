package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Actions.Common_Action;
import Actions.GtplHomePage_Actions;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import Utils.ExcelUtils;

public class LoginWithExcel {
	
	String url = "https://demo.guru99.com/V1/index.php";
    GtplHomePage_Actions gtplHomePage_Actions;
    Common_Action common_Actions;
	String username;
	String password;
	
	public  LoginWithExcel(Common_Action common_Actions,GtplHomePage_Actions gtplHomePage_Actions) {
    	this.common_Actions =common_Actions;
    	this.gtplHomePage_Actions =gtplHomePage_Actions;
    }
    

	@Given("user reads credentials from Excel")
	public void readCredentialsFromExcel() {
		String path = "D:\\eclipse\\Workspace\\BDD-Project\\resources\\credentials.xlsx";  // You can use relative path also
		username = ExcelUtils.getCellData(path, "Sheet1", 1, 0);
		password = ExcelUtils.getCellData(path, "Sheet1", 1, 1);
		System.out.println(username);
		System.out.println(password);
	}

	@When("user enters the credentials into the login page")
	public void enterCredentials() {
		common_Actions.navigateToUrl(url);
		gtplHomePage_Actions.enterUserID(username);
        gtplHomePage_Actions.enterPassword(password);
        gtplHomePage_Actions.clickLogin();
		
	}

	@Then("user should be logged in successfully")
	public void verifyLogin() {
		Assert.assertEquals(common_Actions.getTitle().trim(), "GTPL Bank Manager HomePage");
        System.out.println("✅ Login Successful");
	}

}
