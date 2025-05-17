package url;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
           WebDriver driver= new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get("https://www.flipkart.com/");
           driver.manage().window().maximize();
        WebElement Electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
        Actions action=new Actions(driver);
        action.moveToElement(Electronics).build().perform();
      
        WebElement hp= driver.findElement(By.linkText("Bluetooth Headphones"));
        action.moveToElement(hp).click().build().perform();

	}

}
