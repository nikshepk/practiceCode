package Section2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Down_Handling {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[text() = '✕']")).click();
	    WebElement element = driver.findElement(By.xpath("//input [@name = 'q']"));
	    element.sendKeys("i phone14 pro");
	    element.submit();
	    Thread.sleep(4000); 
	    /* 1st approach with the help of Javascript Executor 
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,6000);");
        */
	    
	    /* 2nd approach with the help of Robot class 
	     Robot r = new Robot();
	     r.keyPress (KeyEvent.VK_PAGE_DOWN); r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	     r.keyPress (KeyEvent.VK_PAGE_DOWN); r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	     r.keyPress (KeyEvent.VK_PAGE_DOWN); r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	     r.keyPress (KeyEvent.VK_PAGE_DOWN); r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	     r.keyPress (KeyEvent.VK_PAGE_DOWN); r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	     r.keyPress (KeyEvent.VK_PAGE_DOWN); r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	    */
	    
	    /*3rd approach with the help of Actions Class */
	    WebElement element1 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[9]"));
	    Actions act = new Actions(driver);
	    act.scrollToElement(element1).perform();
	    
}
}