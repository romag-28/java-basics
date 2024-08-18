package Selenium;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Amazon_customerservice
	{

		public static void main(String[] args) 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			WebElement cust_service_link=driver.findElement(By.linkText("Customer Service"));
			
			cust_service_link.click();
			
			
			
		}

	}


