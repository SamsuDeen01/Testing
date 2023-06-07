package com.example.testing.day5;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Task2 {
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		if(url.equals("https://j2store.net/free/"))
		{
			System.out.println("Correct url");
		}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)","");
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		String url1=driver.getCurrentUrl();
		if(url1.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
			System.out.println("Correct inside url");
		}
	}
}
