package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();//to download latest version
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[4]")).click();
	}

}
