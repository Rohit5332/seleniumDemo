package com.cg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath="//input[@id='j_username']")
	WebElement username;
	@FindBy(xpath="//input[@id='j_password']")
	WebElement password;
	@FindBy(xpath="//button[@id='loginajax']")
	WebElement submit;
	
	
	public LoginPage()
	{
		init();
		PageFactory.initElements(driver,this);
	}
	
	
	public void enterUserName(String un)
	{
		username.sendKeys(un);
	}
	public void enterPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public void clickBtn()
	{
		submit.click();
	}

}
