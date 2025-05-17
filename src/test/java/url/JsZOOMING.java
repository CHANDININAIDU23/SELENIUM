package url;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsZOOMING {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get("https://demo.nopcommerce.com/");
			 driver.manage().window().maximize();
			
			  driver.findElement(By.name("q"));
			  
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 
			  js.executeScript("document.body.style.zoom='50%'");

	}

}
