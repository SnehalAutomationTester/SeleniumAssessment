package com.exercise.basepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	public BasePage(WebDriver driver){
		 this.driver=driver;
	     PageFactory.initElements(driver,this);
	}
	
	 public void waitForElementToVisible(WebElement element){
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	 public void waitForElementToVisibilityOfLocator(By ele){
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
	    }

}
