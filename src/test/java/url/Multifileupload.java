package url;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multifileupload {


public static void main(String[]args) {
	 
	 WebDriver driver =new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	 driver.manage().window().maximize();
	String file1="C:\\Users\\Admin\\Downloads\\Husendra (3)\\text.txt";
	String file2="C:\\Users\\\\Admin\\Downloads\\Husendra (3)\\text2.txt";
	driver.findElement(By.name("filesToUpload")).sendKeys(file1+"\n"+file2);
	 
	 
	 
	 
 }
}
