package com.exercise.testcomponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.exercise.pages.LandingPage;


public class BaseTest {
	public WebDriver driver;
    public LandingPage landingPage;
	public WebDriver initialiazeDriver() throws IOException{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src/main/java/com/exercise/resource/GlobalData.properties");
	    prop.load(fis);
	    String browserName=prop.getProperty("browser");
	    if(browserName.equalsIgnoreCase("chrome"))
	    {
	    	driver=new ChromeDriver();
	    }
	    else if(browserName.equalsIgnoreCase("firefox"))
	    {
	    	driver=new FirefoxDriver();
	    }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 return driver;
	}
    @BeforeMethod
    public LandingPage launchWebApplication() throws IOException {
        driver=initialiazeDriver();
        landingPage=new LandingPage(driver);
        landingPage.getUrlToLaunch();
        return landingPage;
    }
    @AfterMethod                                                  
    public void tearDown() throws IOException { 
        driver.quit();                             
    } 
     
}
