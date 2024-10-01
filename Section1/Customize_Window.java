package Section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Customize_Window {

	public static void main(String[] args) throws Exception {
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium Folder\\chromedriver.exe");
	    
	    ChromeDriver driver = new ChromeDriver(option);
	    driver.get("https://demo.actitime.com/login.do");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.manage().window().minimize();
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    // driver.manage().window().setSize(new Dimension(200, 300));
	     Dimension d = new Dimension(200, 300);
	     driver.manage().window().setSize(d);
	     Thread.sleep(3000);
	    // driver.manage().window().setPosition(new Point(200, 300));
	     Point p = new Point(200,300);
	     driver.manage().window().setPosition(p);
	     // Thread.sleep(3000);
	     driver.close();
	     }
}
