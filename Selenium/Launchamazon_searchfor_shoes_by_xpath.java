package Selenium;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Launchamazon_searchfor_shoes_by_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amzon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input)[5]"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		WebElement e1=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]);"));
		e1.click();
		Set<String> S1=driver.getWindowHandles();
		Iterator<String> i1= S1.Iterator();
		String parentid=i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println()
		
	}

}
