package com.exercise.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.exercise.basepage.BasePage;
import com.exercise.utils.TestAppDataConstants;

public class LandingPage extends BasePage{
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="txtUsername")
	WebElement userEmail;
	
	@FindBy(id="txtPassword")
	WebElement userPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	
	
	public HomePage loginWithUserCredential(String username,String password)
	{
		userEmail.sendKeys(username);
		userPassword.sendKeys(password);
		loginButton.click();
		return new HomePage(driver);
		
	}
	
	 public void getUrlToLaunch(){
	        driver.get(TestAppDataConstants.BROWSER_URL);
	    }
	
	
	
	
 
}
