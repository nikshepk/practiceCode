package Section1;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation_Programs {
public static void main(String[] args) throws Exception {
ChromeOptions option = new ChromeOptions();
option.addArguments ("--remote-allow-origins=*");
option.addArguments("--disable-notifications");
System.setProperty("webdriver.chrome.driver", "D:\\Selenium Folder\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver(option);
// driver.get("https://www.irctc.co.in/nget/train-search"); 
driver.navigate().to("https://www.irctc.co.in/nget/train-search");
driver.manage().window().maximize();  
Thread.sleep(4000);
//driver.get("https://www.flipkart.com/");
driver.navigate().to("https://www.flipkart.com/");
Thread.sleep(4000);
/*
approach 1:-
driver.navigate().back();
Thread.sleep(4000);
driver.navigate().forward();
Thread.sleep(4000);
driver.navigate().refresh();

*/

/*approach 2: */
Navigation nav = driver.navigate();
nav.back();
Thread.sleep(4000);
nav.forward();
Thread.sleep(4000);
nav.refresh();
driver.close();
}
}