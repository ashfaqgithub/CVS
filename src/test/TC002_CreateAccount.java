package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.Config;
import locators.CVSLocators;
import values.CVSValues;

public class TC002_CreateAccount extends Config {
	
	CVSLocators CVSL = new CVSLocators();
	CVSValues CVSV = new CVSValues();
	
	@Test
	public void CreateAccountFunction() throws InterruptedException{
		
		clickByXpath(CVSL.CreateAccount);
		
		typeByName(CVSL.FirstName, CVSV.FirstName);
		typeByName(CVSL.LastName, CVSV.LastName);
		typeByName(CVSL.Email, CVSV.Email);
		typeByName(CVSL.Password, CVSV.Password);
		typeByName(CVSL.ConfirmPass, CVSV.ConfirmPass);
		
		WebElement SelectQues = driver.findElement(By.xpath("//*[@id='securityQuestion']"));
		Select SelQuestion = new Select (SelectQues);
		SelQuestion.selectByVisibleText("What was the name of my childhood pet?");
		SelQuestion.getFirstSelectedOption().getText();
		
		typeByName(CVSL.SecurityAns, CVSV.SecurityAns);
		
		clickByXpath(CVSL.RememberMe);
		
		Thread.sleep(5000);
		
		clickByXpath(CVSL.ContinueButton);
		
		
		Thread.sleep(5000);
		
		//Continued
		typeByName(CVSL.StreetAddress ,CVSV.StreetAddress);
		typeByName(CVSL.Apt ,CVSV.Apt);
		Thread.sleep(3000);
		typeByName(CVSL.City ,CVSV.City);
				
		WebElement SelectState = driver.findElement(By.xpath("//*[@id='state']"));
		Select SelectNY = new Select (SelectState);
		SelectNY.selectByVisibleText("NY");
		SelectNY.getFirstSelectedOption().getText();
		
		typeByName(CVSL.ZipCode ,CVSV.ZipCode);
		typeByName(CVSL.Phone ,CVSV.Phone);
		typeByXpath(CVSL.DOBM, CVSV.DOBM);
		typeByXpath(CVSL.DOBD, CVSV.DOBD);
		typeByXpath(CVSL.DOBY, CVSV.DOBY);
		
		
		WebElement SelectGender = driver.findElement(By.xpath("//*[@id='gender']"));
		Select SelectMale = new Select (SelectGender);
		SelectMale.selectByVisibleText("Male");
		SelectMale.getFirstSelectedOption().getText();		
		
		Thread.sleep(5000);
		
		clickByXpath(CVSL.CreateAccountButton);
		
		Thread.sleep(5000);
	}

}
