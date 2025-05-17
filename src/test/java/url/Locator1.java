package url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator1 {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("CHANDINI");
        driver.findElement(By.name("lastname")).sendKeys("NAIDU");
        WebElement date= driver.findElement(By.name("birthday_day"));
         Select day=new Select(date);
          day.deselectByIndex(24);
         
	}
}