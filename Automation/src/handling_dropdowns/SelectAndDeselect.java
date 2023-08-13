package handling_dropdowns;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
	static {
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
		Set<String> set=new TreeSet();
		int size = options.size();
		for (int i = 0; i < options.size(); i++) {
			s.selectByIndex(i);
		}
		for (int i = options.size()-1; i>=0; i--) {
			s.deselectByIndex(i);
		}
		for (int i=0;i<size;i++) {
			WebElement ele = options.get(i);
			String text = ele.getText();
			set.add(text);
		}
		//getWrappedElement is going to wrap all the options and return
		//has 1 web element
		WebElement ele = s.getWrappedElement();
		System.out.println(ele.getText());
//		for (String s1 : set) {
//			System.out.println(s1);
//		}
		
	}

}






