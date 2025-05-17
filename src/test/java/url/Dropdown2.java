 package url;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {// non select or bootstrap

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2 ");
		driver.manage().window().maximize();
	     driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	     
	    driver.findElement(By.xpath("//input[@value='Java']")).click();
	      
	    List<WebElement> course= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	    System.out.println(course.size());
	   
	    for (WebElement op:course) {
	    	System.out.println(op.getText());
	    }
	      //for selecting multiple options att single time  
	    for(WebElement op:course) {
	    	String option=op.getText();
	    	if(option.equals("Python")||option.equals("MySQL")) {
	    		op.click();
	    	}
	    }
	  
	    }
}
