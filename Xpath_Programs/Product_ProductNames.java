package Xpath_Programs;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Product_ProductNames {
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
   List <WebElement> pName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
    Thread.sleep(4000);
    /* One way to perform this Operation
    for(WebElement all :pName)
    {
    	String allProductName = all.getText();
    	System.out.println(allProductName);
    }
    */
    
    
    /* 2nd way to perform this operation */
    Iterator<WebElement> itr = pName.iterator();
    while(itr.hasNext())
    {
    	String allProductName = itr.next().getText();
    	System.out.println(allProductName);
    }
    driver.close();
}
}