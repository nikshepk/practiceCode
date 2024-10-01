package Section1;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra_Website {
	public static void main(String[] args) throws Exception {
		// Launch Chrome Browser
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    System.setProperty("webdriver.chrome.driver","D:\\Selenium Folder\\chromedriver.exe");
	    // Access myntra website
	    ChromeDriver driver = new ChromeDriver(option);
	    driver.get("https://www.myntra.com/");
	    // Maximize
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    //fetch url
	    Thread.sleep(3000);
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    //fetch Title
	    Thread.sleep(3000);
	    String title = driver.getTitle();
	    System.out.println(title);
	    // Minimize
	    Thread.sleep(3000);
	    driver.manage().window().minimize();
	    // Maximize
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    // Resize
	    Thread.sleep(3000);
	     Dimension d = new Dimension(200, 300);
	     driver.manage().window().setSize(d);
	     // Re locate
	     Thread.sleep(3000);
	     Point p = new Point(200,300);
	     driver.manage().window().setPosition(p);
	     // maximize
	     Thread.sleep(3000);
	     driver.manage().window().maximize();
	     // close
	     Thread.sleep(3000);
	     driver.close();
	     }
}