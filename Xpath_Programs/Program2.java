package Xpath_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program2 {
public static void main(String[] args) throws Exception {
	ChromeOptions option = new ChromeOptions();
     option.addArguments("--remote-allow-origins=*");
     System.setProperty("webdriver.chrome.driver","D:\\Selenium Folder\\chromedriver.exe");
     ChromeDriver driver = new ChromeDriver(option);
     driver.get("https://www.flipkart.com/");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//button[text() = '✕']")).click();
     WebElement element = driver.findElement(By.xpath("//input [@name = 'q']"));
     element.sendKeys("i phone11");
     element.submit();
     Thread.sleep(4000);
     driver.findElement(By.xpath("//div[text() = 'Price -- High to Low']")).click();
     String pname = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 Pro Max (Midnight Green, 64 GB)']")).getText();
     System.out.println(pname);
     driver.close();
}
}