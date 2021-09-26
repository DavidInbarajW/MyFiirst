package com.cts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.baseclass.LibGlobal;

public class LoginPage extends LibGlobal
{ 
	public LoginPage() 
{
	PageFactory.initElements(driver, this);
}
	@FindBy(id="email")
	private WebElement txtUsername;
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnClick;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	

}
