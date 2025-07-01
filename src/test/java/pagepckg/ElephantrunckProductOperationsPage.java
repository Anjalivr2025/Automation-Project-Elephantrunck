package pagepckg;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElephantrunckProductOperationsPage
{

        WebDriver driver;
	 
        @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[1]/h4/a/img")
        WebElement logo;
 
	    @FindBy(xpath="//*[@id=\"st-search\"]")
        WebElement search;
	 
	    @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[6]/a")
        WebElement keralaSaree;
	 
	    @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[7]/a")
        WebElement bodyCare;
	 
	    @FindBy(xpath="//*[@id=\"collection-module-1532039018217\"]/div[3]/a")
        WebElement shopCollect;
	 
	    @FindBy(tagName ="a")
	    List<WebElement> li;
	   
	    
		public ElephantrunckProductOperationsPage(WebDriver driver) 
	    {
		      this.driver=driver; 
		      PageFactory.initElements(driver,this);
	    }
	   	
	
	   public void productSearch()
	   {
		   
		   search.clear();
		   search.click(); 
		   search.sendKeys("Shampoos");
		   search.sendKeys(Keys.ENTER);  
		   
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		   driver.navigate().back();
		   logo.click();   
	   }
	
	   public void sareeScreenshot() throws InterruptedException, IOException
	   {
		   keralaSaree.click();
		   JavascriptExecutor js=(JavascriptExecutor)driver;
	  	   js.executeScript("window.scrollBy(0,1000);");
	  	   Thread.sleep(3000);
	       File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	   	   FileHandler.copy(screenShot,new File("./KeralaSarees/sarees.png"));	
	   	   Thread.sleep(3000);
	   	   driver.navigate().back();
	   	
	   }
	   
	   public void wordSearch() throws InterruptedException
	    {
		    bodyCare.click();
	    	String pagesrc=driver.getPageSource();  
	        String SG="Body Care";
	        if(pagesrc.contains(SG))
	         {
	         System.out.println("Test is present");	
	         }
	         else
	         {
	       	  System.out.println("Test is not present");
	         }
	        Thread.sleep(3000);
	        driver.navigate().back();
	    }
	
	   public void checkButton() throws InterruptedException
		{
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1500);"); 
			
			if(shopCollect.isDisplayed())
	        {
	        System.out.println("Shop Featured Collection  button is present");	
	        }
	        else
	        {
	      	  System.out.println("Button is not present");
	        }
			
			Thread.sleep(3000);
		}
	   
	   public void linkverifyMethod()
	   {
		 
	     for(WebElement e:li)
			{	
			String link=e.getAttribute("href");
			verify(link);
			}
        }


	private void verify(String link)
	{
		try
	    {
	    URI ob=new URI(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println(" Successful link response code is 200 ----------"+link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println(" Broken link response code is 404 ----------"+link);
		}
		else
		{
			System.out.println("Other links ----------"+link);
     	}	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    }
		
	}

	   
}
