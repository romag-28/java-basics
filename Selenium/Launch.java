package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
	    driver.get ("https://www.google.com");
	    
	    Thread.sleep(2000);
	    
	    System.out.println(driver.getWindowHandle());
	    System.out.println(driver.getWindowHandles());
	    
	
	}
	

}
