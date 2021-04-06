package Jasper.Automation.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.*;

import Jasper.Automation.Pages.BasePage;

import Jasper.Automation.Utilities.BrowserFactory;
import Jasper.Automation.Utilities.PropertiesFile;

import Jasper.Automation.Pages.HomePage;


public class Tests extends BasePage {
	
	
/********************FACTORIAL TEST CASES***************************************/
	
	
	@Test
	public void Happy_path_Get_factorial_valid_num() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		homepage.CalculateFactorial("5");
		Wait(1);
		Assert.assertTrue((homepage.Resultx.getText()).contains("120"));
		
		
		      
	}
	
	
	@Test
	public void Get_factorial_for_limit_value_zero() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		homepage.CalculateFactorial("0");
		Wait(1);
		Assert.assertTrue((homepage.Resultx.getText()).contains("1"));
		
		
		      
	}
	
	
	@Test
	public void Get_factorial_for_limit_value_170() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		homepage.CalculateFactorial("170");
		Wait(1);
		Assert.assertTrue((homepage.Resultx.getText()).contains("7.257415615307999e+306"));
		
		
		      
	}
	
	
	@Test
	public void Factorial_for_limit_value_171_is_Not_infinity() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		homepage.CalculateFactorial("171");
		Wait(1);
		System.out.println(homepage.Resultx.getText());
		Assert.assertTrue(!(homepage.Resultx.getText()).contains("Infinity"));
		
		      
	}
	
	@Test
	public void Check_provisional_text_for_Terms_and_condition() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		ClickOnButton(homepage.Terms);
		Assert.assertTrue(driver.getPageSource().contains("This is the terms and conditions document. We are not yet ready with it. Stay tuned!"));
		      
	}
	
	@Test
	public void Check_provisional_text_for_Privacy() {
		
		HomePage homepage= PageFactory.initElements(driver, HomePage.class);
		
		Wait(1);
		homepage.AssertPage();
		ClickOnButton(homepage.Privacy);
		Assert.assertTrue(driver.getPageSource().contains("This is the privacy document. We are not yet ready with it. Stay tuned!"));
		      
	}


	
	

	
}