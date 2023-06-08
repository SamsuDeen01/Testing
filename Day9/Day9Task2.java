package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Day9Task2 {
	WebDriver driver=new EdgeDriver();
  @Test
  public void tc001() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  Thread.sleep(5000);
	  Assert.assertEquals(title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  String url=driver.getCurrentUrl();
	  Thread.sleep(5000);
	  Assert.assertEquals(url, "https://www.godaddy.com/en-in");
	  Thread.sleep(5000);
	  System.out.println("Thread count is : "+Thread.currentThread().getId());
  }
  @Test
  public void tc002() throws InterruptedException
  {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a")).click();
	  System.out.println("Thread count is : "+Thread.currentThread().getId());
  }
  @Test
  public void tc003() throws InterruptedException
  {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Domain Name Search")).click();
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "GoDaddy Domain Search - Buy and Register Available Domain Names");
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]"));
	  search.isDisplayed();
	  Thread.sleep(5000);
	  search.sendKeys("mydomain");
	  Thread.sleep(5000);
	  WebElement buyit=driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button"));
	  buyit.click();
	  System.out.println("Thread count is : "+Thread.currentThread().getId());
  }
}
