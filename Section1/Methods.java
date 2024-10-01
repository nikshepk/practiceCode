package Section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Methods {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium Folder\\chromedriver.exe");
	    
	    ChromeDriver driver = new ChromeDriver(option);
	    driver.get("https://demo.actitime.com/login.do");
	    String title = driver.getTitle();
	    String url = driver.getCurrentUrl();
	    String srccode = driver.getPageSource();
	    System.out.println(title);
	    System.out.println(url);
	    System.out.println(srccode);
	}

}
