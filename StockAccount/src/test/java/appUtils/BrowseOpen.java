package appUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BrowseOpen {
 public static String url="http://projects.qedgetech.com/webapp/login.php";
public  WebDriver driver;
 @BeforeTest
 public void open() {
	 
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get(url);
	 
 }
 @AfterTest
 public void close() throws InterruptedException {
	 Thread.sleep(5000);
	 driver.close();
 }
 
}
