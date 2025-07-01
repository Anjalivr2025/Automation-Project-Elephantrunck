package testpckg;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pagepckg.ElephantrunckCartPage;
import pagepckg.ElephantrunckContactPage;
import pagepckg.ElephantrunckPage;
import pagepckg.ElephantrunckProductOperationsPage;
import pagepckg.ElephantrunckProductPage;

public class ElephantrunckTest extends BaseclassElephantrunck
{

	@Test
	public void verifyElephant() throws InterruptedException, IOException  
	{
    	ElephantrunckPage ob=new ElephantrunckPage(driver);
	    ob.titlePrint();
		ob.logoVerification();
		
	    ElephantrunckProductPage ob1=new ElephantrunckProductPage(driver);
		ob1.spicesMenu();
		ob1.spicecomboMenu();
		ob1.dryfruitsMenu();
		ob1.giftboxMenu();
		
		ElephantrunckContactPage ob2=new ElephantrunckContactPage(driver); 
		ob2.contactUs();
	   // ob2.subscriptionMethod();
		
	
		ElephantrunckProductOperationsPage ob3=new ElephantrunckProductOperationsPage(driver);
		ob3.productSearch();
    	ob3.sareeScreenshot();
		ob3.wordSearch();
		ob3.checkButton();
		ob3.linkverifyMethod();
	
		
		ElephantrunckCartPage  ob4=new ElephantrunckCartPage(driver); 
		ob4.skincareMenu();
		ob4.addProducts();
	    ob4.viewCart();
	    ob4.continueShopping();
        ob4.checkOut();
	
	}
}	


