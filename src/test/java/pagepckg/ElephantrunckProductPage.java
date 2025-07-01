package pagepckg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElephantrunckProductPage 
{

	
	 WebDriver driver;
    
    @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[1]/a")
    WebElement spices;
    
    @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[1]/ul/li[2]/a")
    WebElement spicePowder;
    
    
    @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[2]/a")
    WebElement spiceCombo;
    
    
    @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[3]/a")
    WebElement dryFruits;
    
    
    @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[10]/a")
    WebElement giftBox;
    
    public ElephantrunckProductPage(WebDriver driver) 
    {
	      this.driver=driver; 
	      PageFactory.initElements(driver,this);
    }  
    
   public void spicesMenu() throws InterruptedException 
	{
	    Actions act=new Actions(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    act.moveToElement(spices).perform();   
        spicePowder.click(); 
        JavascriptExecutor js=(JavascriptExecutor)driver;
   	    js.executeScript("window.scrollBy(0,1000);");
   	    Thread.sleep(3000);
   	    driver.navigate().back();
   	   	}
  
   public void spicecomboMenu() throws InterruptedException
   {
	   
	    spiceCombo.click();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
  	    js.executeScript("window.scrollBy(0,500);");
  	    Thread.sleep(5000);
  	    driver.navigate().back();
   }
   
   public void dryfruitsMenu() throws InterruptedException
   {
	   
	    dryFruits.click();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
  	    js.executeScript("window.scrollBy(0,1000);");
  	    Thread.sleep(5000);
  	    driver.navigate().back();
   }
   
  public void giftboxMenu() throws InterruptedException
   {
	    giftBox.click();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
 	    js.executeScript("window.scrollBy(0,1000);");
 	    Thread.sleep(5000);
 	    driver.navigate().back();
  
   }
   
  
	
	
}
