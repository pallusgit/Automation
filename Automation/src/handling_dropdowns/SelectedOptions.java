package handling_dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedOptions {
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
		WebElement ele = s.getFirstSelectedOption();
		String text = ele.getText();
		System.out.println(text);
		List<WebElement> alloptions = s.getAllSelectedOptions();
		for(int i=0;i<alloptions.size();i++) {
			WebElement ele1 = alloptions.get(i);
			String text1 = ele.getText();
			System.out.println(text1);
		}
	}
}
