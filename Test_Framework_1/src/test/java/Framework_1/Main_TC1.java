package Framework_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class Main_TC1 {
	protected WebDriver driver;
	@Test
	public void VerifyPageload() throws InterruptedException
	{
			//print Logging to System text in Console window
			System.out.println("Logging to System");
			//driver = new ChromeDriver() instead of this here we use ChromeOption to give chrome.exe path 
			// When we execute in Jenkins
		  	ChromeOptions chromeOptions= new ChromeOptions();
		  	//chrome.exe installation location
			chromeOptions.setBinary("C:\\Users\\srangani\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
			//ChromeDriver.exe location
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\srangani\\ChromeDriver\\chromedriver.exe");
			String expecedTitle ="Guru99 Bank Home Page";
			String actualTitle="";
			ChromeDriver driver = new ChromeDriver(chromeOptions);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/");
			driver.manage().window().maximize();
			System.out.println("Guru99 page loaded sucessfully");
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
			driver.close();
	}
	

}
