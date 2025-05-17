package url;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsscrollbar3 {

	public static void main(String[] args) {
       WebDriver driver= new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demo.nopcommerce.com/");
       driver.manage().window().maximize();
       JavascriptExecutor jv=(JavascriptExecutor) driver;
		jv.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(jv.executeScript("return window.pageYOffset;"));
		jv.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(jv.executeScript("return window.pageYOffset;"));

	}

}
