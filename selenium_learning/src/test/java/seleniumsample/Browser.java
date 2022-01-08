package seleniumsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public void firefoxlaunch() {
			WebDriverManager.firefoxdriver().setup();//to download latest version
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			}
		public void Edgelaunch() {
			WebDriverManager.edgedriver().setup();//to download latest version
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
			}

	}


