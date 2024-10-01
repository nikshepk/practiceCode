package Section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_stroke_Handling {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	 driver.manage().window().maximize();
	 /* With the help of Keys Claa 
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin" , Keys.TAB , "manager" , Keys.ENTER);
	  */
	 
	 /* With help of Robot class */ 
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("trainee");
	 Thread.sleep(4000);
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_A);
	 r.keyRelease(KeyEvent.VK_A);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_C);
	 r.keyRelease(KeyEvent.VK_C);
	 r.keyPress(KeyEvent.VK_TAB);
	 r.keyRelease(KeyEvent.VK_TAB);
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_V);
	 r.keyRelease(KeyEvent.VK_V);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
}
}
