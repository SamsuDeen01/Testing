package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9Task4 {
	WebDriver driver;
	  @BeforeTest
	  public void test1() throws InterruptedException {
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(3000);
		  driver.manage().window().maximize();  
	  }
	  @Test
	  public void test2() throws InterruptedException {  
		  Thread.sleep(3000);
		  WebElement type = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		  type.sendKeys("Admin");
		  Thread.sleep(3000);
		  WebElement pass = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		  pass.sendKeys("admin123");
		  Thread.sleep(3000);
		  WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		  login.click();
		  Thread.sleep(3000);
		  String title=driver.getCurrentUrl();
		  Assert.assertEquals(title, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  }
	  @AfterMethod
	  public void after() throws InterruptedException{
		  Thread.sleep(3000);
		  driver.quit();
	  }
	}

