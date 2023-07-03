package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Baseclass;

public class Myleadpage extends Baseclass{

	public Myleadpage(ChromeDriver driver) {
		
		Baseclass.driver=driver;
		
		
	}
	
	public CreateLeadPage clickoncreate() {
		String prop1s =prop.getProperty("link_Create_Lead");
		
		driver.findElement(By.linkText(prop1s)).click();
		return new CreateLeadPage(driver);
	}

}

