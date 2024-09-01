package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	

		public class YouTube
		{

			public static void main(String[] args) throws InterruptedException 
			{
				ChromeDriver driver=new ChromeDriver();
				  
				  driver.get("https://www.youtube.com/");
				  driver.manage().window().maximize();
				  Thread.sleep(3000);
				  
				  WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
				  search.sendKeys("grotechminds");
				  search.sendKeys(Keys.ENTER);
				  
				  driver.findElement(By.partialLinkText("Subscribe")).click();
				
			}

		}
	}

}
