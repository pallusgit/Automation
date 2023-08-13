package handling_dropdowns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicates {	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement r = driver.findElement(By.id("r"));
	Select s = new Select(r);
	List<WebElement> options = s.getOptions();
	Set<String> set=new HashSet<>();
	List<String>l=new ArrayList<>();
	int size = options.size();
	for (int i=0;i<size;i++) {
		WebElement ele = options.get(i);
		String text = ele.getText();
	if(!set.add(text)) {
		l.add(text);
	}
	}
	System.out.println(set);
	System.out.println(l);
}
}
