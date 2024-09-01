package Selenium.TestNG.Programme;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class3 {

	
	@Test
	
	public void testcase1()
	{
		System.out.println("search");	
	}
@Test
	
	public void testcase2()
	{
		System.out.println("add to cart");	
	}
	@BeforeMethod
	public void launch()
	{
		System.out.println("browser launch");	
	}
	@AfterMethod
	public void quit()
	{
		System.out.println("browser quit");	
		
	}
}
