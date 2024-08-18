package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchIndia {

	public static void main(String[] args) throws InterruptedException 
	{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement e1= driver.findElement(By.name("q"));
			e1.sendKeys("Korea");
			Thread.sleep(3000);
			e1.sendKeys(Keys.ARROW_DOWN+""+Keys.ARROW_DOWN) ; //to overcome the error adding 2 keys sir added space
			//e1.sendKeys() ;
			e1.sendKeys(Keys.ENTER);Thread.sleep(2000);
			
	}
	
}