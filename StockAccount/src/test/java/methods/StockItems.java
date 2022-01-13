package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import appUtils.BrowseOpen;

public class StockItems extends BrowseOpen {

	public StockItems(WebDriver driver) {
		this.driver = driver;
	}

	public void AddStockHolder(String catger, String SupNum, String StockName, String Unit_Of_Measurement,
			String Purchasing_Price, String Selling_Price, String Notes) throws InterruptedException {
		driver.findElement(By.xpath("//ul[@id=\"ewHorizMenu\"]/li[2]")).click();
		driver.findElement(By.xpath("//a[@data-original-title=\"Add\"]")).click();

		WebElement catagery = driver.findElement(By.id("x_Category"));
		Select sel1 = new Select(catagery);
		sel1.selectByVisibleText(catger);

		WebElement Supplier_Number = driver.findElement(By.id("x_Supplier_Number"));
		Select sel2 = new Select(Supplier_Number);
		sel2.selectByVisibleText(SupNum);

		driver.findElement(By.id("x_Stock_Name")).sendKeys(StockName);

		WebElement Unit_Measurement = driver.findElement(By.id("x_Unit_Of_Measurement"));
		Select sel3 = new Select(Unit_Measurement);
		sel3.selectByVisibleText(Unit_Of_Measurement);

		driver.findElement(By.id("x_Purchasing_Price")).sendKeys(Purchasing_Price);

		driver.findElement(By.id("x_Selling_Price")).sendKeys(Selling_Price);

		driver.findElement(By.id("x_Notes")).sendKeys(Notes);

		driver.findElement(By.id("btnAction")).click();
		Thread.sleep(2000);

		String confirm = driver.findElement(By.xpath("//div[@class=\"ajs-content\"]")).getText();
		System.out.println(confirm);

		driver.findElement(By.xpath("//button[@class=\"ajs-button btn btn-primary\"]")).click();

	}

}
