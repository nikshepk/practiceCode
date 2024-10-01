package Xpath_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProductName_ProductPrice1 {
public static void main(String[] args) throws Exception {
	int count =0;
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
    List <WebElement> PName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
    List <WebElement> Pprice = driver.findElements
    (By.xpath("//div[@class='_4rR01T']/../following-sibling::div/div[1]/div[1]/div[1]"));
    Thread.sleep(4000);
    for(int i=0;i<=PName.size()-1;i++)
    {
    	System.out.println(PName.get(i).getText()+"---->"+Pprice.get(i).getText());
    if(i<=count)
    count++;
    }
    System.out.println(count);
    Thread.sleep(4000);
    driver.close();
    
}
}
