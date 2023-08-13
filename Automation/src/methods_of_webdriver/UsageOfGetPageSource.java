package methods_of_webdriver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSource {static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//It is used to fetch the page source of a webpage
	String pagesrc = driver.getPageSource();
	System.out.println(pagesrc);
	String expectedText = "Facebook helps you connect and share with the people in your life.";
	if(pagesrc.contains(expectedText)) {
		System.out.println("Pass: The mentioned text is present");
	}
	else
		System.out.println("Fail: The mentioned text is not present");
	driver.quit();
}
}
