package url;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROPDOWN1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();  
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("ALLU");
		driver.findElement(By.name("lastName")).sendKeys("ARJUN");
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		driver.findElement(By.id("userName")).sendKeys("chandini23@gmail.com");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("Tamil Nadu");
		WebElement pin=driver.findElement(By.name("postalCode"));
		      pin.sendKeys("631208");
		WebElement countrys=driver.findElement(By.name("country"));
		    Select countryoption=new Select(countrys);
		        countryoption.selectByVisibleText("INDIA");
		        
		     List<WebElement> options=countryoption.getOptions();
		     System.out.println(options.size());
		     
		    // for(int i=0; i<options.size();i++) {
		    	// System.out.println(options.get(i).getText());}
		    	 
		    	 for(WebElement op:options) {
		    		 System.out.println(op.getText());
		    	 }
		     

	}

}
