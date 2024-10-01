package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUser_KeysClass {
 public static void main(String[] args) throws Exception {
   WebDriver driver = new ChromeDriver(); 
	 driver.get("https://demo.actitime.com/login.do");
	 Thread.sleep(3000);
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin" , Keys.TAB , "manager" , Keys.ENTER);
	 Thread.sleep(2000);
	 driver.findElement(By.id("container_users")).click();
	 driver.findElement(By.xpath("//div[@class='components_button_label']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']"))
	 .sendKeys("Rama" , Keys.TAB ,Keys.TAB , "Krishna" , Keys.TAB ,"ramakrishna@gmail.com");
}
}
