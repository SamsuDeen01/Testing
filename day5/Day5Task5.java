package com.example.testing.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Task5 {
	public static void main(String args[])
		{
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.smart-hospital.in/site/login");
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
			driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span")).click();
			String text=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).getText();
			String tag=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")).getTagName();
			String size=driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).getSize().toString();
			String colour=driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).getCssValue("color");
			System.out.println(text);
			System.out.println(tag);
			System.out.println(size);
			System.out.println(colour);
		}
}
