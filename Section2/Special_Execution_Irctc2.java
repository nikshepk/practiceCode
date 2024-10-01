package Section2;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Special_Execution_Irctc2 {

	public static void main(String[] args) throws Exception {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath ("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();

		Thread.sleep(4000);
		TreeSet<Object> ts = new TreeSet<>();
		List<WebElement> alloptions  = driver.findElements (By.xpath("//ul[@role='listbox']"));
		Thread.sleep(4000);

		Iterator<WebElement> itr = alloptions.iterator();
		Thread.sleep(4000);
		while(itr.hasNext())
		{
		String options = itr.next().getText();
        ts.add(options);  
	//	System.out.println(options); // -->to fetch all the data in normal way
	
	}
		System.out.println(ts);
	}
}
