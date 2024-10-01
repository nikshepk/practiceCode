package Section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","D:\\Selenium Folder\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");

	}

}
