package com.example.testing.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8Task3 {
public static void main(String args[]) throws InterruptedException
{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	search.click();
	search.sendKeys("401");
	Thread.sleep(2000);
	WebElement submit=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	submit.click();
	Thread.sleep(2000);
	Alert a=driver.switchTo().alert();
	a.dismiss();
	Thread.sleep(2000);
	search.clear();
	Thread.sleep(2000);
	search.sendKeys("402");
	submit.click();
	Thread.sleep(2000);
	a.accept();
	String msg=a.getText();
	System.out.print(msg);
}
}
