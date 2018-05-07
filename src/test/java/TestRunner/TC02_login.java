package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
	
	@CucumberOptions(
			
		features="Feature",
			
		//features="C:\\Users\\laptop\\liton\\Bootcamp\\Feature\\login2.feature",
			
		glue="stefDef",
		
		tags="@login2"
			
			
			)
public class TC02_login extends AbstractTestNGCucumberTests{}


