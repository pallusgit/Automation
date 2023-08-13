package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox = driver.findElement(By.name("remember"));
		checkbox.click();
		//To verify whether an element is selected or not
		//The returntype of isSelected() is boolean
		if(checkbox.isSelected()) {
			System.out.println("The checkbox is selected");
		}
		else {
			System.out.println("The checkbox is not selected");
		}
		
	
	
	
	
	}
}
