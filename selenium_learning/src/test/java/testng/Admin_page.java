package testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Admin_page {
	public WebDriver driver;
  @Test
  public void Admin() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
	  
		WebElement job=driver.findElement(By.id("menu_admin_Job"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(job).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();//to download latest version
		 driver=new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
