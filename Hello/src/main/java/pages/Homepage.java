//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Base.Baseclass;
//
//public class Homepage extends Baseclass{
//	
//
//	public Homepage(ChromeDriver driver) {
//		Baseclass.driver=driver;
//	}
//	
//	public Loginpage clicklogoutbutton() {
//		driver.findElement(By.className("decorativesubmit")).click();	
//		return new Loginpage(driver);
//		
//		}
//	public Myhomepage  clickcrmslink() {
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		return new Myhomepage(driver);
//	}
//
//}
