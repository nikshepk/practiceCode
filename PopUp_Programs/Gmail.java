package PopUp_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S335877920%3A1689427374615221&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeDOFXhscWyPxKVtZE-z1-KUY7q8nrDaceQrXtaTMAEHWBSnqPVgQiVDpdfDzLQIT_mqVGubKVBE6A&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("" , Keys.ENTER);
    driver.findElement(By.xpath("//a[@class='WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb']")).click();
}
}
