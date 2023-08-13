package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutomation {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.flipkart.com/");
	// driver.findElement(By.xpath("//button[text()='✕']")).click();
	 driver.findElement(By.name("q")).sendKeys("iphone14pro max"+ Keys.ENTER);
List<WebElement> allMobiles =
driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
List<WebElement> allPrices =driver.findElements
(By.xpath("//div[contains(text(),'APPLE iPhone')]/../../div[2]/div[1]/div[1]/div[1]"));
for (int i = 0; i <allMobiles.size(); i++) {
	String mobileName = allMobiles.get(i).getText();
	String price = allPrices.get(i).getText();
	System.out.println(mobileName+" --> "+price);
}



}
}