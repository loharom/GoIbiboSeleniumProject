package com.capstoneAssesment.GoIbiboSeleniumProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.capstoneAssesment.GoIbiboSeleniumProject.utils.Log;

public class LoginPage extends BasePage {
	
	/* login Page Locators */
	
	@FindBy(name = "username")
	public WebElement login_useraname;
	
	@FindBy(name = "password")
	public WebElement login_password;
	
	@FindBy(tagName = "button")
	public WebElement login_button;
	
	@FindBy(xpath = "//div[@role=\"alert\"]/div[1]/p")
	public WebElement login_invalid_credentials_label;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);		
		PageFactory.initElements(driver, this);		
	}
}