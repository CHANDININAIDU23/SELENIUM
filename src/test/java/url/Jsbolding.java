package url;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jsbolding {
	

	public static void main (String[]args) throws InterruptedException {
		
		 WebDriver driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.nopcommerce.com/");
		 driver.manage().window().maximize();
		Thread.sleep(5000);
		  WebElement Search = driver.findElement(By.name("q"));
		  
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 Thread.sleep(5000);
		  js.executeScript("arguments[0].setAttribute('style','backgroud:Yellow;border:2pxSolidred;');",Search);
		 
		  
		  
	}

}
