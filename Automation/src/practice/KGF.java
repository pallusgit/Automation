package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KGF {
@Test(priority=1, invocationCount  = 1)
void rocky() {
	Reporter.log("Rocky",true);
}@Test(priority=3)
void garuda() {
	Reporter.log("garuda",true);	
}@Test(priority=2)
void reena() {
	Reporter.log("reena",true);	
}@Test(priority = 7)
void ramikaSen() {
	Reporter.log("ramikaSen",true);	
}@Test(priority =4,dependsOnMethods = "garuda")
void vaanaram() {
	Reporter.log("vaanaram",true);	
}@Test(priority = 6)
void adheera() {
	Reporter.log("adheera",true);
}@Test(priority = 5)
void virat() {
	Reporter.log("virat",true);

}
}
