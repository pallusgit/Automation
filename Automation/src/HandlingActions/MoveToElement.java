package HandlingActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		List<WebElement> navMenu = driver.findElements
				(By.xpath("//div[@class='desktop-navLinks']/div"));
		Actions actions=new Actions(driver);
		for (WebElement menu : navMenu) {
			Thread.sleep(2000);
			actions.moveToElement(menu).perform();
		}
	}
}
