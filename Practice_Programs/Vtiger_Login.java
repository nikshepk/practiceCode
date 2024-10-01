package Practice_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Vtiger_Login {
	public static void main(String[] args) throws Exception {
		  ChromeOptions option = new ChromeOptions(); 
		  option.addArguments ("--remote-allow-origins=*");
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver (option); 
			driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
		    Thread.sleep(3000);
			driver.manage().window().maximize();
	        Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	        Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
}
}
