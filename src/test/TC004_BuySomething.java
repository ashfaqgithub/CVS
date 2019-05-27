package test;

import org.testng.annotations.Test;

import base.Config;
import locators.CVSLocators;
import values.CVSValues;

public class TC004_BuySomething extends Config{
	

	CVSLocators CVSL = new CVSLocators();
	CVSValues CVSV = new CVSValues();

	@Test
	public void SignIn() throws InterruptedException{
		
		clickByXpath(CVSL.SignIn);
		typeByXpath(CVSL.SignInEmail, CVSV.SignInEmail);
		clickByXpath(CVSL.SignInCont);
		Thread.sleep(5000);
		typeByXpath(CVSL.SignInPass, CVSV.SignInPass);
		clickByXpath(CVSL.SigninSubmit);
		Thread.sleep(5000);
		
		clickByXpath(CVSL.ShopButton);
		Thread.sleep(3000);
		clickByXpath(CVSL.ShopVitamins);
		Thread.sleep(3000);
		clickByXpath(CVSL.SelectProduct);
		Thread.sleep(3000);
		clickByXpath(CVSL.SelectCount100);
		Thread.sleep(3000);
		clickByXpath(CVSL.AddtoBasket);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}