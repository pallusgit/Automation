package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class UsageofRobot {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	Runtime r = Runtime.getRuntime();
	r.exec("notepad");
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_M);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_D);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_M);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_D);
	robot.keyPress(KeyEvent.VK_ENTER);
}
}
