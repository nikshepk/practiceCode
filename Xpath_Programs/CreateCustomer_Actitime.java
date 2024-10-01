package Xpath_Programs;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateCustomer_Actitime {
	public static void main(String[] args) throws Exception {
		Random number = new Random();
		int num = number.nextInt(1000);
		  ChromeOptions option = new ChromeOptions(); 
		  option.addArguments ("--remote-allow-origins=*");
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver (option); 
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.className("initial")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("container_tasks")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='title ellipsis'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='item createNewCustomer'])")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Rama"+num);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).
			sendKeys("Rama is the son of Dasaratha, the King of Ayodhya");
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='components_button_label'])[17]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='logout']")).click();
			
}
}
