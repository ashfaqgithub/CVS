package test;

import org.testng.annotations.Test;

import base.Config;
import locators.CVSLocators;
import values.CVSValues;

public class TC003_SignIn extends Config{

	
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
	}
	
	
	
	
	
	
	
	
}
