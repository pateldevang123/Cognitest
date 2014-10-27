package CognizantProject;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class BaseClass {

		protected WebDriver driver;
		
		public BaseClass(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public void openBrowser()
		{
			
		}
		
		public void clickTheLink(String linktxt)
		{
			driver.findElement(By.linkText(linktxt)).click();
		}
		
		public int noofwindowsopen()
		{
			Set<String> AllWindowHandles = driver.getWindowHandles();
			AllWindowHandles = driver.getWindowHandles();
			int noofwindows1 = AllWindowHandles.size();
			AllWindowHandles.clear();
			return noofwindows1;
		}
		
	}


