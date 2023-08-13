package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySize {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement emailTB = driver.findElement(By.id("username"));
		WebElement pwTB = driver.findElement(By.name("pwd"));
		//This is used to get the size of a web element in a webpage
		//The returntype of get size() is Dimension class 
		//Using dimension class reference we need to fetch both height
		//and width of an element
		Dimension d = emailTB.getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		Dimension d1 = pwTB.getSize();
		int height1 = d1.getHeight();
		int width1 = d1.getWidth();
		if(height==height1&&width==width1) {
			System.out.println("Height and width of bothy the text boxes are same");
		}
		else {
			System.out.println("Height and width of both the text boxes are not same");
		}
	}

}
