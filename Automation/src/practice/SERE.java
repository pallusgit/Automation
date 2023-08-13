package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SERE {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		//Address of the unTbx element will be @22S11
		WebElement untbx = driver.findElement(By.id("username"));
		//Once after reloading address will be @25A02
		driver.navigate().refresh();
		//But in the untbx we will have old address itself, hence we get StaleElementReference
		untbx.sendKeys("admin");
	}
}
