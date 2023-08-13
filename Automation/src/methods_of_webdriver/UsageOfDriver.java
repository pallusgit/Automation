package methods_of_webdriver;

import org.openqa.selenium.WebDriver;

public class UsageOfDriver {
	static void demo(WebDriver driver) {
		driver.get("https://www.fb.com");
		// It is used to fetch the title of a web page and return in String format
		System.out.println(driver.getTitle());
		driver.close();
	}
}
