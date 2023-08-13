package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ParallelExecution {
static {
	System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	//In order to create generalised container we do upcasting
	//Unwanted implementations can be avoided by upcasting
	//Since only webdriver methods will be present in driver reference
	WebDriver driver = new EdgeDriver();
	UsageOfDriver.demo(driver);
	WebDriver driver1 = new ChromeDriver();
	UsageOfDriver.demo(driver1);
	//According to OOAD principle we must store the objects in interface reference type only
}
}






