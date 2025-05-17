package url;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptforscrollbar {

	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement News= driver.findElement(By.xpath("//strong[text()='News']"));
		
		JavascriptExecutor jv=(JavascriptExecutor) driver;
		
		jv.executeScript("arguments[0].scrollIntoView();",News);
		System.out.println(jv.executeScript("return window.pageYOffset;"));
	

	}

}
