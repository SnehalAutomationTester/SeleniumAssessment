package com.exercise.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exercise.basepage.BasePage;

public class EventPage extends BasePage{
	WebDriver driver;
	
	public EventPage(WebDriver driver) {
		    super(driver);
			this.driver=driver;
			PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="input#OhrmJob_name")
	WebElement name;
	
	public void setName(String userName)
	{
		name.sendKeys(userName);
		name.sendKeys(Keys.TAB);
		
	}
	


}
