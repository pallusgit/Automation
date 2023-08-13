package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Allu arjun");
	Thread.sleep(2000);
	List<WebElement> allSugg =
	driver.findElements(By.xpath("//span[contains(text(),'allu arjun')]"));
	for (WebElement ele : allSugg) {
		String name = ele.getText();
		System.out.println(name);
	}
	int count = allSugg.size();
	allSugg.get(count-1).click();



}
}






