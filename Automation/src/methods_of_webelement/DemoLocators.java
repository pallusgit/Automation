package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/A.html");
//	WebElement ele = driver.findElement(By.tagName("a"));
//	WebElement ele1 = driver.findElement(By.id("d1"));
//	WebElement ele = driver.findElement(By.name("n2"));
	WebElement ele = driver.findElement(By.className("c1"));
	System.out.println(ele);//address of web element 
	ele.click();
	driver.quit();
}
}
