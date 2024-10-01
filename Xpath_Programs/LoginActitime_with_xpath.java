package Xpath_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginActitime_with_xpath {
 public static void main(String[] args) {
	 ChromeOptions option = new ChromeOptions(); 
	 option.addArguments ("--remote-allow-origins=*");
	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver (option); 
	 driver.get("https://demo.actitime.com/login.do");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	 driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
