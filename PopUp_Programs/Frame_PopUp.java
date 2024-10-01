package PopUp_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_PopUp {
   public static void main(String[] args) throws Exception {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize(); 
      driver.findElement(By.xpath("(//a[text()='Frames'])[1]")).click();
      driver.switchTo().frame(0);
      driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
      driver.switchTo().defaultContent();
      driver.switchTo().frame(1);
      Thread.sleep(3000);
      driver.findElement(By.xpath("//span[text()='Alert']")).click();
      driver.switchTo().defaultContent();
      Thread.sleep(3000);
      driver.switchTo().frame(2);
      String text= driver.findElement(By.xpath("(//li[@class='blockList'])[1]")).getText();
       System.out.println(text);
   }
  } 