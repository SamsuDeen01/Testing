package testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.example.testing.day9.CalculatorLogic;

import junit.framework.Assert;

public class CalculatorData {

	CalculatorLogic cl=new CalculatorLogic();
	@Test(dataProvider = "testData")
	public void addMethod(int a,int b,int expected)
	{
		int result=cl.add(a,b);
		Assert.assertEquals(expected, result);
	}
	@DataProvider
	public Object[][] testData()
			{
		return new Object[][]
				{
			{1,2,3},
				};
			}
	
	@Test(dataProvider = "subdata")
	public void subMethod(int a,int b,int expected)
	{
		int result=cl.subtract(a, b);
		Assert.assertEquals(expected, result);
	}
	@DataProvider
	public Object[][] subdata()
	{
		return new Object[][]
				{
			{4,2,2}
				};
	}
	
	@Test(dataProvider = "multidata")
	public void MultMethod(int a,int b,double expected)
	{
		double result=cl.multiply(a, b);
		Assert.assertEquals(expected, result);
	}
	@DataProvider
	public Object[][] multidata()
	{
		return new Object[][]
				{
			{8,3,24}
				};
	}
	
	@Test(dataProvider = "divdata")
	public void divMethod(int a,int b,float expected)
	{
		float result=cl.divide(a, b);
		Assert.assertEquals(expected, result);
	}
	@DataProvider
	public Object[][] divdata()
	{
		return new Object[][]
				{
			{4,2,2}
				};
	}
}
