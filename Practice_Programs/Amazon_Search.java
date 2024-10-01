package Practice_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon_Search {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String name = driver.getTitle();
	System.out.println(name);
	WebElement element = driver.findElement(By.cssSelector("input[type= 'text']"));
	element.sendKeys("Iphone 11");
	element.submit();
	String element2 = driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']")).getText();
	System.out.println(element2);
	WebElement element1 = driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']"));
	element1.click();
	
}
}
