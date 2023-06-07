package com.example.testing.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Task3 {
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://j2store.net/free/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		js.executeScript("window.scrollBy(0,200)", "");
		String name=driver.findElement(By.linkText("Simple")).getText();
		String name1=driver.findElement(By.linkText("Variable")).getText();
		String name2=driver.findElement(By.linkText("T-Shirt1")).getText();
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		driver.quit();
	}
}
