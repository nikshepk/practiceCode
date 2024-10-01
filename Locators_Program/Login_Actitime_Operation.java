package Locators_Program;

import org.openqa.selenium. By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 public class Login_Actitime_Operation {
 public static void main(String[] args) throws Exception {
  ChromeOptions option = new ChromeOptions(); 
  option.addArguments ("--remote-allow-origins=*");
  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
  ChromeDriver driver = new ChromeDriver (option); 
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.className("initial")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("container_tasks")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("container_reports")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("container_users")).click();
	Thread.sleep(10000);
	driver.close();
}
}