package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	
		public class SBIReg {

			public static void main(String[] args)
			{
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
				driver.navigate().refresh();
				//Thread.sleep(3000);
				driver.manage().window().maximize();
				WebElement acc_no=driver.findElement(By.name("accountNo"));
				
				acc_no.sendKeys("1233377890");
				
				WebElement cif_no=driver.findElement(By.name("cifNo"));
				
				cif_no.sendKeys("343687637672");
				
				WebElement branch_code=driver.findElement(By.id("branchCode"));
				branch_code.sendKeys("GURG12345678");

				WebElement mobile_no=driver.findElement(By.id("mobileNo"));
				mobile_no.sendKeys("555556788");
				
				WebElement captcha=driver.findElement(By.name("captchaValue"));
				captcha.sendKeys("F8A0F");
				
				WebElement i_agree_btn=driver.findElement(By.id("iAgreeconsent"));
				i_agree_btn.click();
				
				
				
			}

		}		
	


