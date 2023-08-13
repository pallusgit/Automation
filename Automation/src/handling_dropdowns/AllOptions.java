package handling_dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
		WebElement lalit = driver.findElement(By.id("l"));
		Select s = new Select(lalit);
		List<WebElement> allOption = s.getOptions();
		for (WebElement option : allOption) {
			String text = option.getText();
			System.out.println(text);
		}
//		WebElement ele = s.getWrappedElement();
//		System.out.println(ele.getText());
}}
