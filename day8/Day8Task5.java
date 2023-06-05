package com.example.testing.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Task5 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String tit1=driver.getTitle();
		String Id1=driver.getCurrentUrl();
		System.out.println(tit1);
		System.out.println(Id1);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement search1=driver.findElement(By.name("q"));
		search1.sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String tit2=driver.getTitle();
		String Id2=driver.getCurrentUrl();
		System.out.println(tit2);
		System.out.println(Id2);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement search2=driver.findElement(By.name("q"));
		search2.sendKeys("Cucumber");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String tit3=driver.getTitle();
		String Id3=driver.getCurrentUrl();
		System.out.println(tit3);
		System.out.println(Id3);
		
		driver.quit();
	}
}
