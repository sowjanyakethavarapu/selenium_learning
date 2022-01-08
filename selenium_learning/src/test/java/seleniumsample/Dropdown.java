package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//to download latest version
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	Select day=new Select(driver.findElement(By.id("day")));
	day.selectByVisibleText("21");
	Select month=new Select(driver.findElement(By.id("month")));
	month.selectByIndex(4);
	}

}
