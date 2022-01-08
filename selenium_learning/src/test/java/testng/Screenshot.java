package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	WebDriver driver;

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
		
		 @AfterMethod
		  public void afterMethod() throws IOException {
			 
			  
			  TakesScreenshot scr=((TakesScreenshot)driver);
				File source=scr.getScreenshotAs(OutputType.FILE);
	
				FileUtils.copyFile(source,new File("\\src\\test\\resources\\screenshot\\login.png"));
				 driver.close();
		  }
		

	}


