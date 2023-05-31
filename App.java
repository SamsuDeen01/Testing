package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
//	Day4-Task-3.1
	public static void main( String[] args ) throws InterruptedException
  {
  	WebDriverManager.edgedriver().setup();
      WebDriver driver=new EdgeDriver();
      driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Ssmsu");
      driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("DON");
  	JavascriptExecutor js = (JavascriptExecutor)driver;
  	js.executeScript("window.scrollBy(0,300)", "");
//		Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Ssmsu@gmail.com");
      driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("thecomrade4433");
      driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	
  }
	
//	Day4-Task-3.2,3.3,3.4
	public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		String url="https://demo.opencart.com/";
		//Launchig the url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("search"));
		search.sendKeys("mobiles");
		//to scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,6800)", "");
		Thread.sleep(3000);
		
		WebElement returns =driver.findElement(By.linkText("Returns"));
		  returns.click();
		  driver.navigate().back();
//		  driver.quit();
		  WebElement gift =driver.findElement(By.linkText("Gift Certificates"));
		  gift.click();
//		  driver.navigate().back();
//		  driver.quit();
		  }
}
