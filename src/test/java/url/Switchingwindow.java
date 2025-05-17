package url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchingwindow {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://demo.guru99.com/selenium/newtours/");
		 
		 Thread.sleep(5000);
		 driver.quit();//close 2 windows
		 // driver.close();//close only last open window
		
	}

}
