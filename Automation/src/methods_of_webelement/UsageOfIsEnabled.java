package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.instagram.com/");
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement btn = driver.findElement(By.tagName("button"));
		//This is used to verify whether the button is enabled or disabled
		//The returntye of isEnabled() is boolean
		if(btn.isEnabled()) {
			System.out.println("the login button is enabled");
		}else {
			System.out.println("the login button is disabled");
		}
		
		
	}
}
