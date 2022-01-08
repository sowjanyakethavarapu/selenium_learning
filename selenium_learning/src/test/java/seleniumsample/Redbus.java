package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();//to download latest version
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("bangalore"+Keys.ENTER);
		/*From.sendKeys("Ban");
		WebElement Fromoptions=driver.findElement(By.id(""))*/
		driver.findElement(By.id("dest")).sendKeys("hyderabad"+Keys.ENTER);
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[5]")).click();
		
		//WebElement submit=driver.findElement(By.xpath("//button[@class='f1 button and id='search_btn']"));
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"search_btn\"]"));
		Thread.sleep(3000);
		submit.click();
		

	}

}
