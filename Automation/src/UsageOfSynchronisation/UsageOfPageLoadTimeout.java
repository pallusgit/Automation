package UsageOfSynchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfPageLoadTimeout {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Page load timeout is going to stop get() once after the specified timeout
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		try {
			//driver.get("https://demo.actitime.com/");
			//driver.get("https://www.myntra.com/");
			//driver.get("https://www.ajio.com/");
			driver.get("https://drait.edu.in/");
		} catch (TimeoutException e) {
			System.out.println("The application is not loaded within 3 seconds");
		}
	}
}
