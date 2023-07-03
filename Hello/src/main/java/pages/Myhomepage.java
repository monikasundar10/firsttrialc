package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Myhomepage extends Baseclass {
	

	public Myhomepage(ChromeDriver driver) {
		
		Baseclass.driver=driver;
		
		
	}
	
	public Myleadpage clickleadlink()  {
//		 Properties prop=new Properties();
//		 FileInputStream fis =new FileInputStream(new File("./src/main/resources/application.properties"));
//		 prop.load(fis);
		  String link3 =prop.getProperty("link_Lead");
//		  System.out.println(link2);
		  
		 
	//	   System.out.println(link2);
		   driver.findElement(By.linkText(link3)).click();
		//driver.findElement(By.linkText("Leads")).click();
		return new Myleadpage(driver);
		
	}
	

}
