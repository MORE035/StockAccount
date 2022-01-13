package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import appUtils.BrowseOpen;
import methods.LoginPage;

public class LoginTestCases extends BrowseOpen{
	
	@Parameters({"username", "pass"})
	@Test(enabled=true,priority = 0)
	public void  LoginValid(String username,String pass) throws InterruptedException  {
		LoginPage LP=new LoginPage(driver);
		LP.Login(username, pass);
		Assert.assertTrue(LP.valid_Login());
		LP.Logout();
		
	}
	@Test(priority = 1 , dataProvider = "data")
	public void LoginInValid(String username,String pass) throws InterruptedException {
		LoginPage LP=new LoginPage(driver);
		LP.Login(username, pass);
		Assert.assertTrue(LP.invalid());
		LP.close_Alart();
		
	}
	
	@DataProvider
	public Object[][] data() {
		
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="111111";
		obj[0][1]="111111";
		obj[1][0]="222222";
		obj[1][1]="222222";
		return obj;

		
		
		
	}
	
}
