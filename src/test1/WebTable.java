package test1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) 
	{
        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/home/gouthamrajtecno/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		List table=  (List) driver.findElements(By.xpath("//*[@id=\"customers\"]"));
		
		List  col= (List) driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("total colums:" +col.size());
		
		List row= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		System.out.println("total rows: "+row.size());
		
		 WebElement cellIneed = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[5]/td[2]"));  //-------------------------              
		  
		 System.out.println("Required Value : " + cellIneed.getText());
		 
		 //scroll
	
		 WebElement element = driver.findElement(By.xpath("//*[@id='main']/h2[1]"));  //------------------------------
	        
	        JavascriptExecutor var1 = (JavascriptExecutor) driver;
	        
	        var1.executeScript("arguments[0].scrollIntoView();", element);
	        
	        
	      
	}

}
