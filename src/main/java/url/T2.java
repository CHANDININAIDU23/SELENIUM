package url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class T2 {

        public static void main (String[]args) throws InterruptedException {
        	
        	WebDriver driver = new ChromeDriver();
        	   driver.navigate().to("https://irctc.co.in");
        	   
        	   driver.navigate().to("https://www.mycamu.co.in/");
        	   
        	   driver.navigate().back();
        	   System.out.println(driver.getCurrentUrl());
        	   
        	   driver.navigate().forward();
        	   System.out.println(driver.getCurrentUrl());
        	  
        	   String Windowid=driver.getWindowHandle();
        	   System.out.println("window id"+ Windowid);
 
        	   
        	   driver.navigate().refresh();
        	   Thread.sleep(2000);
        	   driver.close();
		   
		    
	}

}
