package testCases;

import org.testng.annotations.Test;

import appUtils.BrowseOpen;
import methods.LoginPage;
import methods.StockItems;

public class StockH_TestCases extends BrowseOpen {
	@Test
	public void addStockHolder() throws InterruptedException {
		LoginPage LP=new LoginPage(driver);
		StockItems SI=new StockItems(driver);
		LP.Login("admin", "master");
		SI.AddStockHolder("PowerBank","india","sand","KGs","100","110","1st Stock");
		
	}
}
