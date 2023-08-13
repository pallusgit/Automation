package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement img = driver.findElement(By.tagName("img"));
		//It is used to fetch the attribute value
	//It is a parameterised method which will take att name as parameter
		//The returnType of getAtt() is String
		String text = img.getAttribute("src");
		System.out.println(text);
		WebElement link = driver.findElement(By.partialLinkText("Forgotten"));
		String text2 = link.getAttribute("href");
		System.out.println(text2);
//		WebElement checkbox = driver.findElement(By.id("keepMeLoggedInCaptionContainer"));	
//	System.out.println(checkbox.getAttribute("title"));	}
}
}









