package allBrowser;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserInitialize {

	WebDriver driver;
	
	public WebDriver ChoosBrowser() {
		
		ResourceBundle rb=ResourceBundle.getBundle("config2");
		String B=rb.getString("Browser");
		
		if (B.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\laptop\\liton\\FED_Report\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
		
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\laptop\\liton\\FED_Report\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 
		}
		driver.get("http://opensource.demo.orangehrmlive.com/");
		return driver;
		
	}
	
	
	
	
}// end class
