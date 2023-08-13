package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssvalue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Create a Page"));
		//It is used to fetch the css value of an element
		//It is a parametrised method which accepts cssAttribute name
		//The returntype of getCssValue() is String
		String color = link.getCssValue("font-weight");
		System.out.println(color);
	}
}
