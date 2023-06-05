package com.example.testing.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Task1 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)","");
		Thread.sleep(1000);
		WebElement src=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions ac=new Actions(driver);
		ac.clickAndHold(src).release(dest).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
