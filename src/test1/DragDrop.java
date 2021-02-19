package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) 
	{
		
        WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/home/gouthamrajtecno/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		 WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));                    
		 //Element on which need to drop.                      
		 WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));                  
		 //Using Action class for drag and drop.                 
		 Actions act =new Actions(driver);                         
		 act.dragAndDrop(From, To).build().perform();
	}

}
