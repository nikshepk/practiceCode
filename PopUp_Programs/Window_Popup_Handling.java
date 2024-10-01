package PopUp_Programs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup_Handling {
  public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[text() = '✕']")).click();
    WebElement element = driver.findElement(By.xpath("//input [@name = 'q']"));
    element.sendKeys("i phone11");
    element.submit();
    driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
    
    String parentid = driver.getWindowHandle();
    Set<String> childid = driver.getWindowHandles();
    
   /* for(String allids : childid)
    {
    	if(!parentid.equals(allids))
    	{
    		driver.switchTo().window(allids);
    	}
    }
   */
    
    Iterator<String> itr = childid.iterator();
    while (itr.hasNext())
    {
	 String all = itr.next();
	 String childTittle = driver.switchTo().window(all).getTitle();
	 
	 if(parentid.contains(childTittle))
	 {
		break; 
	 }
	}
    String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
    System.out.println(text);   
}
}