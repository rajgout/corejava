package test1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	
	public static void main(String[] args)
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/home/gouthamrajtecno/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		TakesScreenshot TSobj= (TakesScreenshot) driver;
		
		File image = TSobj.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(image, new File("test.png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
