package pagepckg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElephantrunckContactPage 
{

	 WebDriver driver;
	 
	 
	 @FindBy(xpath="//*[@id=\"shopify-section-announcement\"]/section/div/div/div[2]/ul/li[2]/a")
     WebElement contact;
    
     @FindBy(xpath="//*[@id=\"Form-contact-template-0\"]")
     WebElement name;
     
     @FindBy(xpath="//*[@id=\"Form-contact-template-1\"]")
     WebElement message;
     
     @FindBy(xpath="//*[@id=\"Form-contact-template-2\"]")
     WebElement phone;
     
     @FindBy(xpath="//*[@id=\"Form-contact-template-3\"]")
     WebElement email;
     
     
     @FindBy(xpath="//*[@id=\"contactFormSubmit\"]")
     WebElement submitButton;
     
     
     @FindBy(xpath="//*[@id=\"mce-EMAIL\"]")
     WebElement subscription;
     
     @FindBy(xpath="//*[@id=\"mc-embedded-subscribe\"]")
     WebElement subsribeButtom;
    
	 
	public ElephantrunckContactPage (WebDriver driver) 
    {
	      this.driver=driver; 
	      PageFactory.initElements(driver,this);
    } 
	public void contactUs() throws InterruptedException
    {
   	 contact.click();
   	 name.sendKeys("Devika");
   	 message.sendKeys("hi");
   	 phone.sendKeys("9999912345");
   	 email.sendKeys("deva123@gmail.com");
   	 
   	 JavascriptExecutor js=(JavascriptExecutor)driver;
   	 js.executeScript("arguments[0].click();",submitButton);
   	 System.out.println("Thanks for contacting us! We'll get back to you as soon as possible");
   	 Thread.sleep(3000);
   	 driver.navigate().back();
    }
    
  public void subscriptionMethod() throws InterruptedException
    {
   	  
   	 subscription.sendKeys("deva123@gmail.com");
   	 JavascriptExecutor js=(JavascriptExecutor)driver;
   	 js.executeScript("arguments[0].click();",subsribeButtom);
   	 System.out.println(" Thankyou for signing up our NewsLetter");  
   	 driver.navigate().back();
    }


	
	
	
}
