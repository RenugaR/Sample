package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinition.Hooks;
import com.utils.LibGlobal;

public class AdactinPagePojo extends LibGlobal {

	public AdactinPagePojo() {
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;
	
	@FindBy(id = "password")
	private WebElement txtPass;
	
	@FindBy(id = "login")
	private WebElement btnLogIn;

	@FindBy(xpath = "//div[contains(@class,'auth_error')]")
	private WebElement authErrorMsg;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

	public WebElement getAuthErrorMsg() {
		return authErrorMsg;
	}

	
}
