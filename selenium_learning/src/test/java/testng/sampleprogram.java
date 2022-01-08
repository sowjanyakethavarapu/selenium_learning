package testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class sampleprogram {
	public WebDriver driver;
	
	 @BeforeMethod
	  public void setup() {
		 WebDriverManager.chromedriver().setup();//to download latest version
		 driver=new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
	  }
  @Test()
  public void login() {
	 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
  }
  
 
 
}
