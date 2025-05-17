package url;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver .get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	  WebElement Electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
      Actions action=new Actions(driver);
      action.moveToElement(Electronics).build().perform();
    
      WebElement cp= driver.findElement(By.linkText("Computer Peripherals"));
      action.moveToElement(cp).click().build().perform();
      
      WebElement checkbox = driver.findElement(By.xpath("//div[text()='Apple']"));
      action.moveToElement(checkbox).click().build().perform();
      
	System.out.println(checkbox.getText());
	
	
	}

}
