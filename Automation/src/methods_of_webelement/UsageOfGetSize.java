package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTB = driver.findElement(By.id("email"));
		WebElement pwTB = driver.findElement(By.id("passContainer"));
		//This is used to get the size of a web element in a webpage
		//The returntype of get size() is Dimension class 
		//Using dimension class reference we need to fetch both height
		//and width of an element
		Dimension d = emailTB.getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		System.out.println(height+ " height of emailTb        width of emailTB "+width);
		Dimension d1 = pwTB.getSize();
		int height1 = d1.getHeight();
		int width1 = d1.getWidth();
		System.out.println(height1+ " height of pwdTB        width of pwdTB "+width1);
	
	}
}
