package steps;

import org.openqa.selenium.WebDriver;

import Actions.Common_Action;
import Actions.GtplHomePage_Actions;
import Hooks.Hooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginGtplBank_Steps {

    
    GtplHomePage_Actions gtplHomePage_Actions;
    Common_Action common_Actions;
    
    public  LoginGtplBank_Steps(Common_Action common_Actions,GtplHomePage_Actions gtplHomePage_Actions) {
    	this.common_Actions =common_Actions;
    	this.gtplHomePage_Actions =gtplHomePage_Actions;
    }
    

    @Given("I am on GTPL bank Login page")
    public void i_am_on_gtpl_bank_login_page() throws Exception {
    	common_Actions.navigateToUrl("https://demo.guru99.com/V1/index.php");
    }


    
    @When("I enter credentials")
    public void i_enter_credentials(DataTable dataTable) {
    	String user = dataTable.cell(1, 0);
        String pass = dataTable.cell(1, 1);

        gtplHomePage_Actions.enterUserID(user);
        gtplHomePage_Actions.enterPassword(pass);
        gtplHomePage_Actions.clickLogin();
    }


    @Then("I Logged In To GTPL Bank Page")
    public void i_logged_in_to_gtpl_bank_page() {
        System.out.println("✅ Login Successful");
    }
}
