package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	@Test
	public void gjhnk() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver(options);
		
		
		driver.get("https://triton.damaka.com/web/");
	
		
	}

}
