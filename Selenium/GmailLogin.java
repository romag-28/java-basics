package Selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GmailLogin {

		public static void main(String[] args) 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			//driver.findElement(By.className("gb_y")).click();
			//driver.findElement(By.xpath("/html/body/header/div/div/div/a[1]")).click();
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deepalip071992@gmail.com");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.ENTER);
		 
			
		}
		

	}