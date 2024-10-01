package Section2;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class ScreenShot_Handling {
public static void main(String[] args) throws Exception {
WebDriver driver = new ChromeDriver(); 
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();

/* downcast the TakesScreenshot Interface */
TakesScreenshot ts = (TakesScreenshot) driver;

/*this method will help to capture the Screenshot */
 File src = ts.getScreenshotAs(OutputType.FILE);

/* This is the destination where we want to store the SS */
  File dest = new File(".\\ScreenShot Folder\\" + "abc.png"); 

 /* This syntax will help copy the ScreenShot from src to destination */
  Files.copy(src, dest);

}
}