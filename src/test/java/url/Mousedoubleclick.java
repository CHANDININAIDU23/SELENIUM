package url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousedoubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		 
		 WebElement field1= driver.findElement(By.xpath("//input[@id='field1']"));
		     field1.clear();
		     field1.sendKeys("WELCOME");
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		     
		 WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		 Thread.sleep(5000);
		 
		Actions action = new  Actions(driver);
	   action.doubleClick(button).build().perform();
	   
	System.out.println(field2.getText());
		

	}

}
