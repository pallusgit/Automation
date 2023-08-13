package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("wiproJobs"+Keys.ENTER);
		 Thread.sleep(3000);
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 for (WebElement ele : allLinks) {
			String url = ele.getAttribute("href");
			System.out.println(url);
		}
	}
	
}
