package Actions;

import org.openqa.selenium.WebDriver;

import Hooks.Hooks;

public class Common_Action {
	 WebDriver driver;
	
	 public Common_Action() {
		this.driver = Hooks.getDriver();
	}
	 
	 public void navigateToUrl(String str) {
		 driver.get(str);
	 }

}
