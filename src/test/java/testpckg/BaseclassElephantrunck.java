package testpckg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseclassElephantrunck 
{

	
	public static WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://elephantrunk.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
	}
	
}
