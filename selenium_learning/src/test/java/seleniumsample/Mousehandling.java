package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();//to download latest version
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		WebElement job=driver.findElement(By.id("menu_admin_Job"));
		WebElement jobcategory=driver.findElement(By.id("menu_admin_jobCategory"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(job).click();
		action.moveToElement(jobcategory).click().build().perform();
		WebElement checkbox=driver.findElement(By.id("ohrmList_chkSelectRecord_6"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
	}
}

