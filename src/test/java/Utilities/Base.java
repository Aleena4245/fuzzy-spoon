package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static WebDriver driver;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Batch08_Jarfiles\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
}
