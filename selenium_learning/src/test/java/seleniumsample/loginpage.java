package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {
	WebDriver driver;

	//public static void main(String[] args) {
		public void launch() {
		WebDriverManager.chromedriver().setup();//to download latest version
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
		public void logindetails() {
			
		driver.findElement(By.id("email")).sendKeys("sowjanya");
		driver.findElement(By.id("pass")).sendKeys("sowjanya");
		
		driver.findElement(By.xpath("(//*[@name='login'])")).click();
		
		driver.close();
		}
}
		

		



