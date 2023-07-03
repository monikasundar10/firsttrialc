package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;

public class Loginpage extends Baseclass {

	public Loginpage(ChromeDriver driver) {
		
		Baseclass.driver=driver;
		PageFactory .initElements(driver,this);
		
		
	}
	
//	@FindBy(how= How.ID,using ="username")  
//	WebElement eleUserName;
//	
//	public  Loginpage  enterusername(String username) {
//		//driver.findElement(By.id("username")).sendKeys(username);
//		eleUserName.sendKeys(username);
//		return this;
//		
//		  
//	}
	
// need to staisfy all the condition in this
//	@FindBys(
//		{
//			
//			@FindBy(how= How.ID,using ="username"),
//			@FindBy(how=How.XPATH,using="//input[@id='username']")
//		
//		}
//		
//	)
//	WebElement eleUserName;
	
	
	public  Loginpage  enterusername(String username) {
	//driver.findElement(By.id("username")).sendKeys(username);
	eleUserName.sendKeys(username);
	return this;
	
	  
}
	
//	public  Loginpage  enterusername(String username) {
//		driver.findElement(By.id("username")).sendKeys(username);
//		return this;
//		
//		
//	}
//	
	public Loginpage enterpassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
		
		
	}
	
	public Homepage clickloginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return  new Homepage(driver);
		
		}

}
