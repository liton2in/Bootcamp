package stefDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import allBrowser.browserInitialize;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.loginpage;

public class login2Step {

	WebDriver driver;
	browserInitialize br;
	loginpage l;
	
	@Given("^Admin Navigateto HRM Login Page$")
	public void admin_Navigateto_HRM_Login_Page() throws Throwable {
	br=new browserInitialize();
	driver=br.ChoosBrowser();
	
	}

	@When("^Admin Enter ValidUserName and Password$")
	public void admin_Enter_ValidUserName_and_Password() throws Throwable {
	l= new loginpage(driver);
	l.EnterUserName().sendKeys("Admin");
	l.EnterPassword().sendKeys("admin");
	}

	@When("^Click on LogingButton$")
	public void click_on_LogingButton() throws Throwable {
		l= new loginpage(driver);
	  l.ClickLogin().click();
	}

	@Then("^Admin will Land in Admi homepage$")
	public void admin_will_Land_in_Admi_homepage() throws Throwable {
	  Assert.assertEquals(driver.getCurrentUrl(),"http://opensource.demo.orangehrmlive.com/index.php/dashboard");
	  driver.close();
	  
	}
	
	
	
	
	
}
