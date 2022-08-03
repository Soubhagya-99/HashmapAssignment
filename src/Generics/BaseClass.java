package Generics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import POM.LoginPage;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		System.out.println("soubhagya");
		System.setProperty("webdriver.chrome.driver","./DRIVER/chromedriver.exe");
		//System.setProperty("webdriver.chrome.silentOutput","true");
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		LoginPage log=new LoginPage(driver);
		log.Username();
        log.Password();
        Thread.sleep(2000);
       /// log.Password1()
        
	}
}
