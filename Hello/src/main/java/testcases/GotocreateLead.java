package testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.Baseclass;
import pages.Loginpage;

public class GotocreateLead extends Baseclass {
	@BeforeSuite
	public void setFileName() {
			ExcelfileName="CreateLead";

		}
	
@Test(dataProvider="getData")
public void entering( String username,String password ,String fname,String lname,String Cname) throws InterruptedException {
	Loginpage joke= new Loginpage(driver);
	joke.enterusername(username).enterpassword(password).clickloginbutton().clickcrmslink().clickleadlink().clickoncreate()
	.name(fname).enterlastpname(lname).entercompanyname(Cname)
	.clicksubmit().verify(fname);
	
}
}
 