package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
	WebDriver driver;
	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		WebDriver driver = new ChromeDriver(chromeOptions);
		chromeOptions.addArguments("--headless");
		driver.get("http://23.236.52.212:80");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }
	 @Test
	  public void verifytest1() {	
		 
		String x = driver.getTitle();
		System.out.println(x);
		Assert.assertEquals(x,x);
	  }
	  @Test
	  public void verifytest2() {	
		  
		String x = driver.getCurrentUrl();
		System.out.println(x);
		Assert.assertEquals(x,x);
	  }
	  @Test
	  public void verifytest3() {	
		
		driver.findElement(By.id("About Us")).click();
		String x = driver.findElement(By.tagName("body")).getText();
		System.out.println(x);
		Assert.assertEquals(x,x);
	  }
	  @AfterClass
	  public void close() {
		  driver.close();
	  }
}
