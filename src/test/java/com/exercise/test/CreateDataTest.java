package com.exercise.test;

import org.testng.annotations.Test;

import com.exercise.pages.EventPage;
import com.exercise.pages.HomePage;
import com.exercise.pages.LandingPage;
import com.exercise.testcomponent.BaseTest;
import com.exercise.utils.TestAppDataConstants;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class CreateDataTest extends BaseTest{
	
	@Test
	public void createData() throws IOException, InterruptedException
	{
		
		LandingPage landingPage=launchWebApplication();
		HomePage homePage=landingPage.loginWithUserCredential(TestAppDataConstants.USERNAME, TestAppDataConstants.PASSWORD);
		homePage.clickToOnboarding();
		EventPage eventPage=homePage.clickOnAddButton();
		eventPage.setName(TestAppDataConstants.NAME);
		
	}

}
