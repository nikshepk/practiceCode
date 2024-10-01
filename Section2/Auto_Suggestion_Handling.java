package Section2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Handling {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[text() = '✕']")).click();
    Thread.sleep(4000);
    WebElement element = driver.findElement(By.xpath("//input [@name = 'q']"));
    element.sendKeys("i phone11");
    Thread.sleep(4000);
    /* by selecting Suggestion box and for each loop
    List<WebElement> suggestionBox =  driver.findElements(By.xpath("//ul[contains(@class,'col-12-12 ')]"));
    Thread.sleep(4000);
    for (WebElement allsuggestions : suggestionBox)
    {
    	String suggestions = allsuggestions.getText();
    	System.out.println(suggestions);
    
    }
    */
    /* by selecting Common attribute name and value and Iterator */
    List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
    Iterator<WebElement> itr = suggestions.iterator();
    Thread.sleep(4000);
    while (itr.hasNext())
    {
    	String allsuggestions = itr.next().getText();
    	System.out.println(allsuggestions);
		
	}
}
}
