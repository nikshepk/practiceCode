package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Handling {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[text() = '✕']")).click();
    WebElement element = driver.findElement(By.xpath("//input [@name = 'q']"));
    element.sendKeys("i phone11");
    element.submit();
    Thread.sleep(4000);
    WebElement SliderRight = driver.findElement(By.xpath("(//input[@class ='3FdlqY'])[2]"));
    WebElement SliderLight = driver.findElement(By.xpath("(//input[@class ='3FdlqY'])[1]"));
    Actions act = new Actions(driver);
    act.dragAndDropBy(SliderRight, -30, 0);
    Thread.sleep(4000);
    act.dragAndDropBy(SliderLight, 30, 0);
}
}
