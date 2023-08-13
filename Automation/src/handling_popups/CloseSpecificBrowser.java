package handling_popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		Set<String> allWid = driver.getWindowHandles();
		int count = allWid.size();
		System.out.println(count);
		String ExpectedTitle = "Apple";
		for (String windowId : allWid) {
			driver.switchTo().window(windowId);
			String title = driver.getTitle();
			if (title.contains(ExpectedTitle)) {
				driver.close();
			}
		}
	}
}
