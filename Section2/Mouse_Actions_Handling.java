package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions_Handling {
		public static void main(String[] args) throws Exception {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//button[text() = '✕']")).click();
		    Thread.sleep(4000);
		    WebElement element = driver.findElement(By.xpath("//div[text()='Grocery']"));
		    Actions act = new Actions(driver);
		    act.moveToElement(element).contextClick().build().perform();
}
}
