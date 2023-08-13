package methods_of_webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTB = driver.findElement(By.id("email"));
		//Sendkeys() is used to enter the value into textbox
		//we can make use of keys enum to enter keys present in keyboard
		emailTB.sendKeys("ViratKohli");
		emailTB.sendKeys(Keys.CONTROL +"A");
		emailTB.sendKeys(Keys.DELETE);
		emailTB.sendKeys("Messi");
		
	
	
	
	}	
}
