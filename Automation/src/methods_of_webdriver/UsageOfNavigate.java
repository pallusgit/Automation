package methods_of_webdriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	 WebDriver driver=new ChromeDriver();
	 //We can pass the URL in string format 
	 driver.navigate().to("https://www.facebook.com/");
	 Thread.sleep(2000);
	//URL() is an example of constructor overloading 
	//We can pass URL type object as an argument
	 URL url = new URL("https://www.myntra.com/");
	 driver.navigate().to(url);
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 driver.quit();
}
}
