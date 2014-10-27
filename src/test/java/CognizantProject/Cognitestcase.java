package CognizantProject;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Cognitestcase {

	WebDriver driver = new FirefoxDriver();
	
	
	@Before
	public void openBrowser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com");
				
	}
	
	@After
	public void closeBrowser()
	{
		driver.quit();
		driver = null;
	}
	
	
	@Test
	public void testTheLink() {
		
		
		
		BaseClass bClass = new BaseClass(driver);
		
		
		bClass.clickTheLink("Multiple Windows");
		int totwindow = bClass.noofwindowsopen();
		
		Assert.assertTrue(driver.findElement(By.linkText("Click Here")).isDisplayed());
		
		bClass.clickTheLink("Click Here");
		int totwindow1 = bClass.noofwindowsopen();
		
		if(totwindow == totwindow1)
		{
			System.out.println("Link doesn't open in the new window");
		}
		else
		{
			System.out.println("Link does open in the new window");
		}
		
		Set<String> AllWindowHandles = driver.getWindowHandles();
		String window1 = (String) AllWindowHandles.toArray()[0];
		
		driver.switchTo().window(window1);
	}
	

}
