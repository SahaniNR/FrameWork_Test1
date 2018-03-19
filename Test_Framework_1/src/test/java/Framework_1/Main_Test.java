package Framework_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class Main_Test {
	protected WebDriver driver;
	@Test
	public void VerifyPageload() throws InterruptedException
	{
			
			System.out.println("Main Test Case");
			
		  ChromeOptions chromeOptions= new ChromeOptions();
		  	
			chromeOptions.setBinary("C:\\Users\\srangani\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\srangani\\ChromeDriver\\chromedriver.exe");
			String expecedTitle ="GTPL Bank Home Page";
			String actualTitle="";
			ChromeDriver driver = new ChromeDriver(chromeOptions);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/V1/index.php");
			driver.manage().window().maximize();
			System.out.println("Guru99 Login page loaded sucessfully");	
			actualTitle=driver.getTitle();
			if (actualTitle.contentEquals(expecedTitle))
			{
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
			System.out.println("Page Title is" + actualTitle);
			//Login to GURU bank Home page
			WebElement tx_username= driver.findElement(By.name("uid"));
			WebElement tx_password=driver.findElement(By.name("password"));
			WebElement btn_login=driver.findElement(By.name("btnLogin"));
			tx_username.sendKeys("mngr122601");
			tx_password.sendKeys("YpygYvu");
			btn_login.click();
			System.out.println("Logged to GURU Bank Home Page");
			System.out.println("Page Title - " + driver.getTitle());
			driver.close();
	}
	

}
