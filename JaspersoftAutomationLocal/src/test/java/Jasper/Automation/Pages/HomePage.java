package Jasper.Automation.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Jasper.Automation.Pages.BasePage;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	
	public HomePage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(id="number") WebElement numberfield;
	@FindBy(id="getFactorial") WebElement factorialbtn;
	@FindBy(id="resultDiv")
	public WebElement Resultx;
	
	@FindBy(xpath="//*[contains(text(), 'The greatest factorial calculator!')]") WebElement Titletxt;
	
	@FindBy(xpath="//*[contains(text(), 'Terms and Conditions')]")
	public WebElement Terms;
	
	@FindBy(xpath="//*[contains(text(), 'Privacy')]")
	public WebElement Privacy;
	
	/*
	
	@FindBy(xpath="//*[contains(text(), 'Administration')]") WebElement Admin;
	@FindBy(xpath="//*[contains(text(), 'Transfer Verification')]") WebElement TransferV;*/
	
	
	public void AssertPage() {
		
		Assert.assertEquals(true, Titletxt.isDisplayed());
		
	
		
	}
	
	public void CalculateFactorial(String num) {
		numberfield.sendKeys(num);
		//password.sendKeys(pass);
		ClickCalculate();
	
		
	}
	
	public void ClickCalculate() {
		
		
		
	
		
		ClickOnButton(factorialbtn);
		
		Wait(2);
	}
	
	
	
	
	
	

}
