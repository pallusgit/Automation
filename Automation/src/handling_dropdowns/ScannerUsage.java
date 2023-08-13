package handling_dropdowns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScannerUsage {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Scanner search=new Scanner(System.in);
	System.out.println("Enter the dish name");
	String text=search.nextLine();
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement r = driver.findElement(By.id("r"));
	Select s = new Select(r);
	List<WebElement> options = s.getOptions();
	int count=0;
	int size = options.size();
	for (int i=0;i<size;i++) {
		WebElement ele = options.get(i);
		String t = ele.getText();
		if(t.equals(text)) {
			count++;
		}
	}
	if(count>0) 
		System.out.println(text+ " is present in the dropdown");
	else 
		System.out.println(text+ " is not present in the dropdown");
}


}
