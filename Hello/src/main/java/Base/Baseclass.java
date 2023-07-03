package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilis.Excelcode;

public class Baseclass {
	public static  ChromeDriver driver;
	public  static Properties prop;
	
	
	
	public String ExcelfileName;
	
	@DataProvider(name="getData")
	public String[][] fetchData() throws IOException
		{
		return Excelcode.readData(ExcelfileName);
	}
	
	
	@BeforeMethod
	public void gjhnk() throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver(options);
		 
		 // properties file Explanation 
		  prop=new Properties();
		 FileInputStream fis =new FileInputStream(new File("./src/main/resources/application.properties"));
		 prop.load(fis);
		  String link2 =prop.getProperty("link_Lead");
		  System.out.println(link2);
//		 String lang= prop.getProperty("lang");
//		 
//		 Properties prop1= new Properties();
//		 FileInputStream  fis2= new FileInputStream(new File("./src/main/resources/"+lang+".properties"));
//		 prop1.load(fis2);
//		 
		 
		   String url=prop.getProperty("url");
		
		  // String link_leads =prop1.getProperty("link leads");
			driver.get(url);
	
		
	}


	
}
