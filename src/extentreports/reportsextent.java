package extentreports;

public class reportsextent {

}
package Extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


 @BeforeTest
public class Extentreportss {
	public void confir()
	{
		
	}

	
		
		
		@Test
		public void intialDemo()
		{
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://rahulshettyacademy.com/");
			System.out.println(driver.getTitle());
		}
	}


