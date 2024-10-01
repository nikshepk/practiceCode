package Section2;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Auto_Suggestion_Handling {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Virat Kohli");
	
	
	/* by selecting Suggestion box and for each loop
	 List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='erkvQe']"));
	Thread.sleep(4000);
	for (WebElement allsuggestion : suggestions)
	{
		String suggestion = allsuggestion.getText();
		System.out.println(suggestion);
	}
	Thread.sleep(4000);
	*/
	
	/* by selecting Common attribute name and value and Iterator */
	Thread.sleep(4000);
	List<WebElement> suggestions = driver.findElements(By.xpath("//li[@data-view-type='1']"));
	Iterator<WebElement> itr = suggestions.iterator();
	Thread.sleep(4000);
	while (itr.hasNext())
	{
		String suggestion = itr.next().getText();
		System.out.println(suggestion);
	}
}
}
