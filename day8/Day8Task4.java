package com.example.testing.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Task4 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Tiruchirappalli",Keys.ENTER);
		Thread.sleep(5000);
		WebElement DOJ=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		DOJ.click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[3]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();		
		Thread.sleep(5000);
		driver.quit();
	}
}
