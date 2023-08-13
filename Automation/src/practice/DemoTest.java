package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class DemoTest {
	@Test
public void demoA(){
		System.out.println("World");//Print the statement only in the console
		Reporter.log("Hello");//Print only in the reports because default value is false
		Reporter.log("Hello",false);//Print only in the reports
		Reporter.log("Hello world", true);//Print both in reports as well as console
}
}