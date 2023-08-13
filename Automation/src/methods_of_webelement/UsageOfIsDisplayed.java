package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement btn = driver.findElement(By.name("login"));
		//It is used to verify whether an element is displayed or not
		//The returntype of isDisplayed() is boolean 
		if(btn.isDisplayed()) {
			System.out.println("The login button is dispalyed");
		}else {
			System.out.println("The login button is not dispalyed");
		}
	
	
	
	}
}
