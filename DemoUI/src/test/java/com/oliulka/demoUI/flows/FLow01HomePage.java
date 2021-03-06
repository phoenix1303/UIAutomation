package com.oliulka.demoUI.flows;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oliulka.demoUI.pages.Page01HomePage;

public class FLow01HomePage{

    private Page01HomePage page01;
     
 	public FLow01HomePage(){
	}

    public void homePageBasicElementsFlow(WebDriver driver) 
    {
    	driver.get("http://www.amazon.com");
    	WebElement homeLogo = page01.homepageAmazonLogo(driver);
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.visibilityOf(homeLogo));
    	System.out.println("Amazon home page was accessed successfully");
    	assertTrue(page01.homepageAmazonSearchBar(driver).isDisplayed());
    	assertTrue(page01.homepageAmazonSearchButton(driver).isDisplayed());
    	assertTrue(page01.homepageAmazonNavigation(driver).isDisplayed());
    	assertTrue(page01.homepageAmazonHamburgerMenu(driver).isDisplayed());
    	System.out.println("Home page elements were asserted successfully"); 
     }
    
    public void homePageHamburgrMenuFlow(WebDriver driver) 
    {
    	driver.get("http://www.amazon.com");
    	WebElement homeLogo = page01.homepageAmazonLogo(driver);
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.visibilityOf(homeLogo));
    	System.out.println("Amazon home page was accessed successfully");
    	//action	
    	System.out.println("Home page elements were asserted successfully"); 
    }
}
