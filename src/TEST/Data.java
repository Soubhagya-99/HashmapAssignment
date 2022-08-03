package TEST;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Data {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","./DRIVER/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
//		String s=getCredentials().get("admin");
//		System.out.println(s);
		driver.findElement(By.id("username")).sendKeys(getUsername("admin"));
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(getPassword("Seller"));
	}
	public static HashMap<String, String> getCredentials()
	{
		HashMap<String,String> hash=new HashMap<>();
		hash.put("catagorymanager","srb:srb@123");
		hash.put("Seller", "Tony:Tony@123");
		hash.put("admin", "Nira:Nira@123");
		hash.put("Distributor","Sonu:Sonu123");
		hash.put("productmanager", "Rabi:Rabi@123");
		hash.put("User","Patel:Patel@123");
		return hash;
	}
	public static String getUsername(String role)
	{
		String credentials=getCredentials().get(role);
		return credentials.split(":")[0];
	}
	public static String getPassword(String role)
	{
		String credentials1=getCredentials().get(role);
		return credentials1.split(":")[1];
	}
}