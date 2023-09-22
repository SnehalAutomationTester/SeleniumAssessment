package com.exercise.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.exercise.basepage.BasePage;

public class HomePage extends BasePage{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{   super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="menu-container")
	WebElement container;
	
	@FindBy(xpath="//div[@id='menu-content']/ul/li")
	List<WebElement> itemList;
	
	
	@FindBy(css="li#left_menu_item_159")
	WebElement onboarding;
	
	
	@FindBy(css="a#addItemBtn")
	WebElement addButton;
	
	@FindBy(xpath="//span[text()='More']")
	WebElement moreButton;
	
	By waitForPlusIcon= By.cssSelector("a#addItemBtn");
	
	
	public void clickToOnboarding()
	
	{   container.click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",onboarding);
		onboarding.click();
	}



	public EventPage clickOnAddButton() throws InterruptedException {
		
		 driver.switchTo().frame("noncoreIframe");
	     waitForElementToVisibilityOfLocator(waitForPlusIcon);
	     addButton.click();
	     Thread.sleep(3000);
	     return new EventPage(driver);
	}

	
}
