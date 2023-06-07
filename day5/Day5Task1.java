package com.example.testing.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Task1 {
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.equals("Home"))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		String title1=driver.getTitle();
		if(title1.equals("Shop"))
		{
			System.out.print("Title of the page is Shop");
		}
		else
		{
			System.out.println("Title is Different");
		}
		driver.quit();
	}
}
