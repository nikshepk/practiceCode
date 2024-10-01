package PopUp_Programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp_Handling {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver(); 
		 driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin" , Keys.TAB , "manager" , Keys.ENTER);
         driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
         driver.findElement(By.xpath("//a[text() = 'Types of Work']")).click();
         driver.findElement(By.xpath("//span[text() = 'Create Type of Work']")).click();
         driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rama");
         driver.findElement(By.xpath("//input[@value='      Cancel      ']")).click();
         
         Alert alt = driver.switchTo().alert();
         String msg = alt.getText();
         System.out.println(msg);
}
}