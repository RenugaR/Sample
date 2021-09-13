package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.AdactinPagePojo;
import com.utils.LibGlobal;

import cucumber.api.java.en.*;

public class AdactionHomePageSteps extends LibGlobal {

	@Given("User launch the browser and navidate to adactin page")
	public void user_launch_the_browser_and_navidate_to_adactin_page() {
		getUrl("http://adactinhotelapp.com/");
	}

	@When("User enters the username and password in adaction home page")
	public void user_enters_the_username_and_password_in_adaction_home_page() throws IOException {
		insertType(new AdactinPagePojo().getTxtUserName(), getData(0, 0));
		insertType(new AdactinPagePojo().getTxtPass(), getData(0, 2));
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		click(new AdactinPagePojo().getBtnLogIn());
	}

	@Then("User validates the error message")
	public void user_validates_the_error_message() {
		boolean displayed = isDisplayed(new AdactinPagePojo().getAuthErrorMsg());
		if (displayed) {
			System.out.println("Error msg is displayed");
		} else {
			System.out.println("Not displayed");
		}
	}

	@When("^User enters the \"([^\"]*)\" and \"([^\"]*)\" in adaction home page$")
	public void user_enters_the_something_and_something_in_adaction_home_page(String userName, String password)
			throws Throwable {
		insertType(new AdactinPagePojo().getTxtUserName(), userName);
		insertType(new AdactinPagePojo().getTxtPass(), password);
	}

}
