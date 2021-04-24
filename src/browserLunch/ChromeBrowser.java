package browserLunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeBrowser {

	WebDriver driver;

	@Test()
	public void ChromeBrowserLunch()
	{
		System.setProperty("webdriver.gecko.driver","/home/imran/Documents/Automation/driver/geckodriver");     

		WebDriver driver=new FirefoxDriver(); // Instantiate a ChromeDriver class.  

		driver.navigate().to("http://www.javatpoint.com/");    // Launch Website

		driver.manage().window().maximize();
	}


}
