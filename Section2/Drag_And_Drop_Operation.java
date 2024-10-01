package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Operation {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	WebElement srcMadrid = driver.findElement(By.xpath("(//div[text() = 'Madrid'])[2]"));
	WebElement destMadrid = driver.findElement(By.xpath("//div[text() = 'Spain']"));
	act.dragAndDrop(srcMadrid,destMadrid).perform();

	WebElement srcRome = driver.findElement(By.xpath("(//div[text() = 'Rome'])[2]"));
	WebElement destItaly = driver.findElement(By.xpath("//div[text() = 'Italy']"));
	act.dragAndDrop(srcRome, destItaly).perform();
	
	WebElement srcWashington = driver.findElement(By.xpath("(//div[text() = 'Washington'])[2]"));
	WebElement destUnitedStates = driver.findElement(By.xpath("//div[text() = 'United States']"));
	act.dragAndDrop(srcWashington, destUnitedStates).perform();
	
	WebElement srcSeoul = driver.findElement(By.xpath("(//div[text() = 'Seoul'])[2]"));
	WebElement destSouthKorea = driver.findElement(By.xpath("//div[text() = 'South Korea']"));
	act.dragAndDrop(srcSeoul, destSouthKorea).perform();
	
	WebElement srcCopenhagen = driver.findElement(By.xpath("(//div[text() = 'Copenhagen'])[2]"));
	WebElement destDenmark = driver.findElement(By.xpath("//div[text() = 'Denmark']"));
	act.dragAndDrop(srcCopenhagen, destDenmark).perform();
	
	WebElement srcStockholm = driver.findElement(By.xpath("(//div[text() = 'Stockholm'])[2]"));
	WebElement destSweden = driver.findElement(By.xpath("//div[text() = 'Sweden']"));
	act.dragAndDrop(srcStockholm, destSweden).perform();
	
	WebElement srcOslo = driver.findElement(By.xpath("(//div[text() = 'Oslo'])[2]"));
	WebElement destNorway = driver.findElement(By.xpath("//div[text() = 'Norway']"));
    act.dragAndDrop(srcOslo, destNorway).perform(); 
	
}
}
