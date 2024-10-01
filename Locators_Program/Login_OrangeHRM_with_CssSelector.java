package Locators_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_OrangeHRM_with_CssSelector {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions(); 
		option.addArguments ("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver (option); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.cssSelector("input[placeholder = 'Username']"));
		element.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.cssSelector("input[placeholder = 'Password']"));
		element1.sendKeys("admin123");
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.cssSelector("button[type= 'submit']"));
		Thread.sleep(3000);
		element2.click();
		Thread.sleep(10000);
		driver.close();
}
}
