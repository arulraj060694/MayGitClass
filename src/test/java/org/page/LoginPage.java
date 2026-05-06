package org.page;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	// POM 
	
	
	// Locator 
	@FindBy(name="name")
	private WebElement userName;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//button[contains(text(),'Sign')]")
	private WebElement sign;
	
	// constructor creation to avoid staleElementRefrenceExcepetion
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// Create the Business Logic
	public void login(String uname, String emai) {
		
		waitForElement(userName).sendKeys(uname);
		waitForElement(email).sendKeys(emai);
		waitAndClick(sign);
		
		
		
	}
}
