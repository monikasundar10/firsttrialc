package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Baseclass;

public class CreateLeadPage extends Baseclass {
	
	public CreateLeadPage(ChromeDriver driver) {
		
		Baseclass.driver=driver;
		
		
	}
	
 public CreateLeadPage name(String fname) {
	 
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	 
	 
	 return this;
 }


  public CreateLeadPage  enterlastpname( String lname) {
	  driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	  return this;
  }
  
  public CreateLeadPage  entercompanyname(String Cname) {
	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
       return  this;
  }
  
  public Viewleadpage clicksubmit()
  {
	  driver.findElement(By.className("smallSubmit")).click();
	  return new Viewleadpage(driver);
  }
	  
  }
