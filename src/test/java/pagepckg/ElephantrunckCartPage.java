package pagepckg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElephantrunckCartPage 
{

	

	 WebDriver driver;
   
     @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[4]/a")
     WebElement skinCare;
     
     @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[4]/ul/li/a")
     WebElement faceCare;
     
     
     @FindBy(xpath="//*[@id=\"product_form_6926247526481\"]/div[2]/div[2]/button/span")
     WebElement greenteaFP;
    
     @FindBy(xpath="//*[@id=\"CartPopoverCont\"]")
     WebElement cart;
     
     @FindBy(xpath="//*[@id=\"Cart\"]/form/div[2]/div[2]/a")
     WebElement continueShop;
     
     @FindBy(xpath="//*[@id=\"shopify-section-header\"]/header/div[1]/div/div[2]/div/nav/ul/li[8]/a")
     WebElement auyoil;
     

     @FindBy(xpath="//*[@id=\"product_form_2899596345425\"]/div[2]/div[2]/button/span")
     WebElement neelioil;
     
     @FindBy(xpath="//*[@id=\"Cart\"]/form/div[2]/div[2]/div/fieldset/button[2]")
     WebElement chectoutButton;
     
     
     public ElephantrunckCartPage(WebDriver driver) 
	 {
		      this.driver=driver; 
		      PageFactory.initElements(driver,this);
	 }
	 public void skincareMenu() throws InterruptedException
	 {
		    Actions act=new Actions(driver);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    act.moveToElement(skinCare).perform();   
	        faceCare.click(); 
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	   	    js.executeScript("window.scrollBy(0,500);");
	   	    Thread.sleep(3000); 	
	 }
	 
	 public void addProducts() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 greenteaFP.click();
		 
	 }
	
	 public void viewCart() throws InterruptedException
	 {
		 
		 cart.click();
		 Thread.sleep(5000);
		 
	 }
	 public void continueShopping() throws InterruptedException
	 {
		 
		 continueShop.click();
		 auyoil.click();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
	   	 js.executeScript("window.scrollBy(0,1000);");
	   	 Thread.sleep(3000);
		 neelioil.click();
		 Thread.sleep(3000);
		 cart.click();
		 
	 }
	 public void checkOut() throws InterruptedException
	 {
		 Thread.sleep(3000); 
		 chectoutButton.click();
		 driver.quit();
		 	 
	 }
	 
}
