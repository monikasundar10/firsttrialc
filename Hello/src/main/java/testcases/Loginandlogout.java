package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.Baseclass;
import pages.Loginpage;

public class Loginandlogout extends Baseclass {

	@Test
	public void runLoginlogout() {
		Loginpage lp= new Loginpage(driver);
		lp.enterusername().enterpassword().clickloginbutton();
		
		
	}
}
