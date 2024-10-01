package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherMethods {
public static void main(String[] args) throws Exception  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.xpath("//input[@name = 'remember']"));
	String title = element.getAttribute("title");
	System.out.println(title);
	System.out.println(element.getSize());
	System.out.println(element.getLocation());
	System.out.println(element.isDisplayed());
	System.out.println(element.isEnabled());
	System.out.println(element.isSelected());
	Thread.sleep(4000);
	driver.close();
}
}
