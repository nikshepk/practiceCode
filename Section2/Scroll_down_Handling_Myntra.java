package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_down_Handling_Myntra {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
    driver.manage().window().maximize();
   driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Shoes");
   Thread.sleep(3000);
    driver.findElement(By.xpath("//span[@data-reactid='909']")).click();
    Thread.sleep(3000);
    WebElement element1 = driver.findElement(By.xpath("(//h4[text() = 'Men Running Shoes'])[2]"));
    Actions act = new Actions(driver);
    act.scrollToElement(element1).perform();
}
}
