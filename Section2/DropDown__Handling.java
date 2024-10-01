package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown__Handling {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[3]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[text()='US - Personal']")).click();
	
}
}
