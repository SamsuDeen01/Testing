package com.example.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day_6Task1 {
	

	public static void main( String[] args ) throws InterruptedException
	  {
	  	WebDriverManager.edgedriver().setup();
	      WebDriver driver=new EdgeDriver();
	      driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Ssmsu");
	      driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("DON");
	  	JavascriptExecutor js = (JavascriptExecutor)driver;
	  	js.executeScript("window.scrollBy(0,800)", "");
	      driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Ssmsu@gmail.com");
	      driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("thecomrade4433");
	      driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	      driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	  }
}
