package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeeKannada {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Zee Kannada");
		Thread.sleep(2000);
List<WebElement> allSugg = 
driver.findElements(By.xpath("//span[contains(text(),'zee')]"));
	allSugg.get(0).click();
	Thread.sleep(3000);
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	System.out.println(allLinks.size());
	for (WebElement ele : allLinks) {
		String url = ele.getAttribute("href");
		System.out.println(url);
	}
	}
}






