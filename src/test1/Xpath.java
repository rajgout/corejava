package test1;

import java.awt.Button;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
	

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/home/gouthamrajtecno/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//*[contains(text(),'Create New Account')]
		/*
		WebElement username = driver.findElement(By.xpath("//*[@name=\"email\"]"));
		username.sendKeys("abc.xyz.com");



		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("123456");

		WebElement button = driver.findElement(By.xpath("//*[@name=\"login\"]"));

		button.click();
		
		*/
		WebElement createaccount = driver.findElement(By.linkText("Create New Account"));
		createaccount.click();
		
		WebElement fname= driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		fname.sendKeys("Goutham");
		
		WebElement lname =driver.findElement(By.xpath("//*[@name=\"lastname\"]"));
		lname.sendKeys("Raj");
		
 
		WebElement mNum= driver.findElement(By.xpath("//*[@name=\"reg_email__\"]"));
		mNum.sendKeys("8008788957");
		
		
		
		WebElement passWord= driver.findElement(By.xpath("//*[@name=\"reg_passwd__\"]"));
	     passWord.sendKeys("raj1233");
		
	     WebElement month= driver.findElement(By.xpath("//*[@id=\"month\"]"));
	     
	     Select ddmonth= new Select(month);
	     
	     ddmonth.selectByValue("11");
	     
	   
	     WebElement Day= driver.findElement(By.xpath("//*[@id=\"day\"]"));
	     Select dday= new Select(Day);
	     dday.selectByValue("18");
	     
	  
	     
	     WebElement year= driver.findElement(By.xpath("//*[@id=\"year\"]"));
	     Select ddyear= new Select(year);
	     ddyear.selectByValue("1996");
	     
	   //*[@id="u_1_3_At"]
	     
	   //*[@class="_5k_2 _5dba"]
	     WebElement Gender= driver.findElement(By.xpath("//*[@id=\"u_1_3_k/\"]/value[2]"));   //---------------------
	     Gender.click();
	     
	     
	     
	     
		
	}

}
