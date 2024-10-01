package PopUp_Programs;

import java.text.SimpleDateFormat; 
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Popup_handling {
   public static void main(String[] args) {
   Calendar cal = Calendar.getInstance();
   cal.add(Calendar.YEAR, 1);
   Date d = cal.getTime();
   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
   String CustomizeFormat =  sdf.format(d); System.out.println(CustomizeFormat);

   WebDriver driver = new ChromeDriver();
   driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
   driver.manage().window().maximize();
   driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(CustomizeFormat);
}
}