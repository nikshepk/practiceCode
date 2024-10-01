package Section1;

import org.openqa.selenium.WebDriver;
/* Step :- 3 import Chrome Driver */
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_ChromeBrowser {
public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
   
    
    /* Step 1 :- Used setProperty to configure */
   // System.setProperty("webdriver.chrome.driver","D:\\Selenium Folder\\chromedriver.exe");
    
    /* Step 2 :- Create Object of Chrome Driver */
 //   ChromeDriver driver = new ChromeDriver(option);
    
    /* Step 4 :- access Web App with the help og get() method */
    driver.get("https://www.flipkart.com/");
}
}