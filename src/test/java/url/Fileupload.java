package url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		 driver.manage().window().maximize();
		  
		 Thread.sleep(5000);
		WebElement upload= driver.findElement(By.xpath("//input[@id='filesToUpload']"));
		Thread.sleep(5000);
		upload. sendKeys("C:\\Users\\Admin\\Downloads\\Husendra (3)\\text.txt");
		
		WebElement field1 = driver.findElement(By.xpath("//ul[@id='fileList']//li"));
		
		if(field1.getText().equals("text.txt")) {
			System.out.println("SUCCESS");
		}
		else {
			System.out.println("pocha pochu");
		}
			
			
		
	}
	

}
