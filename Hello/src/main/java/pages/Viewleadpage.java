package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Base.Baseclass;

public class Viewleadpage extends Baseclass {
	

	public Viewleadpage(ChromeDriver driver) {
		
		Baseclass.driver=driver;
		
		
	}

	public void verify(String fname)
	{
		String actual =driver.findElement(By.id("viewLead_firstName_sp")).getText();
		Assert.assertEquals(fname, actual);
	}
}

