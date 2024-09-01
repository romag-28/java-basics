package Selenium.TestNG.Programme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1 {
	@Test(timeOut=9000)

	
	public void Register() throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cust_service_link=driver.findElement(By.linkText("Customer Service"));
		
		cust_service_link.click();
		
		
		
	}

}
