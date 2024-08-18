package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.facebook.com/login/"));
		cd.manage().window().maximize();
		
		cd.findElement(By)
		
	}

}
