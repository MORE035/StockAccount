package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUtils.BrowseOpen;

public class LoginPage extends BrowseOpen {

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public void Login(String Username1 ,String Pass) {
		driver.findElement(By.id("username")).clear();

		driver.findElement(By.id("username")).sendKeys(Username1);
		driver.findElement(By.id("password")).clear();

		driver.findElement(By.id("password")).sendKeys(Pass);
		driver.findElement(By.id("btnsubmit")).click();
		
		
	}
	public boolean valid_Login() {
		
		if(driver.findElement(By.id("ewPageCaption")).isDisplayed()) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	public void Logout() throws InterruptedException {
		driver.findElement(By.id("mi_logout")).click();
		
	}
	public boolean invalid() {
		
		String alert = driver.findElement(By.xpath("//*[@class=\"alert alert-danger ewError\"]")).getText().toLowerCase();
		if(alert.contains("incorrect")) {
			return true;
		}else {
			return false;
		}
	}
	public void close_Alart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"ajs-button btn btn-primary\"]")).click();
	}
	

}
