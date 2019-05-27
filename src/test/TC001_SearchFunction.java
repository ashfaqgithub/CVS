package test;

import org.testng.annotations.Test;

import base.Config;
import locators.CVSLocators;
import values.CVSValues;

public class TC001_SearchFunction extends Config {

	CVSLocators CVSL = new CVSLocators();
	CVSValues CVSV = new CVSValues();
	
	@Test
	public void SearchInfo() throws InterruptedException{
		typeByXpath(CVSL.SearchBox, CVSV.SearchBox);
		clickByXpath(CVSL.SearchClick);
		Thread.sleep(5000);
	
		
	}
	
	
}
