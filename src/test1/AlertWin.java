package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWin {

	public static void main(String[] args) 
	{
		//http://demo.guru99.com/test/delete_customer.php");
			
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "/home/gouthamrajtecno/Downloads/chromedriver");
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	  driver.findElement(By.name("cusid")).sendKeys("53920");                    
      driver.findElement(By.name("submit")).submit();
      
      Alert obj = driver.switchTo().alert();
      
      System.out.println(obj.getText());
      
      obj.accept();
	

	}

}
