package handling_dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSingleSelect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		Thread.sleep(2000);
		//Select the option based on index of that option
		s.deselectByIndex(1);
//		Thread.sleep(2000);
//		//Select the option based on value of value attribute in option tag
//		s.selectByValue("11");
//		Thread.sleep(2000);
//		//Select the option based upon tagtext
//		s.selectByVisibleText("Apr");
	}
	
}









