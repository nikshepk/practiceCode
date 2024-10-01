package Section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation_Programs1 {
	public static void main(String[] args) throws Exception {
		ChromeOptions option = new ChromeOptions();
		option.addArguments ("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.myntra.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();  
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4000);
		driver.get("https://www.shadi.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.close();
}
}