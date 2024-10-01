package PopUp_Programs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivision_PopUp {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver(); 
	 driver.get("https://demo.actitime.com/login.do");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin" , Keys.TAB , "manager" , Keys.ENTER);
     driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
     driver.findElement(By.xpath("(//div[@class='img'])[1]")).click();
     driver.findElement(By.xpath("//div[text()='Delete'])[1]")).click();
     
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 String textvalue = wait.until(ExpectedConditions.visibilityOfElementLocated(
	By.xpath("//div[contains(text(),'You are about to delete')]"))).getText();
    System.out.println(textvalue);
}
}