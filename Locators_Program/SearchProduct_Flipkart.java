package Locators_Program;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.chrome.ChromeOptions;
 public class SearchProduct_Flipkart {
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions option = new ChromeOptions(); 
			option.addArguments ("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver (option); 
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.cssSelector("button[class=\'_2KpZ6l _2doB4z\']"));
		    Thread.sleep(3000);
			element.click();
		    WebElement element1 = driver.findElement(By.cssSelector("input[class='_3704LK']"));
			element1.sendKeys("Iphone 14");
			Thread.sleep(3000);
			WebElement element2 = driver.findElement(By.cssSelector("path[class='_34RNph']"));
		    element2.click();
			Thread.sleep(10000);
	         driver.close();
}
}