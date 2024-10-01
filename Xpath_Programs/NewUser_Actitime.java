package Xpath_Programs;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewUser_Actitime {
	public static void main(String[] args) throws Exception {
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
			Thread.sleep(2000);
			driver.findElement(By.id("container_users")).click();
            driver.findElement(By.xpath("//div[@class='components_button_label']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("Rama");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("Krishna");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("ramakrishna@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//div[@class='components_button_label'])[4]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()=\"Close\"][1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(4000);
            driver.close();
}
}
