package pagepckg;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElephantrunckPage 
{

     WebDriver driver;
      
      @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[1]/h4/a/img")
      WebElement logo;
      
     
       
      public ElephantrunckPage(WebDriver driver) 
      {
 	      this.driver=driver; 
 	      PageFactory.initElements(driver,this);
      }  
       
     
     public void titlePrint() throws InterruptedException
     {
     	String actualTitle=driver.getTitle();
     	System.out.println("Title of the Page  : "+actualTitle);
        Thread.sleep(3000);
 
     }
     public void logoVerification()
 	{
 	      if(logo.isDisplayed())
 		   {
 			   System.out.println("Logo is present");
 		   }
 		   else
 		   {
 			   System.out.println("Logo is not present");
 		   }			   	
 	}
     
     }
