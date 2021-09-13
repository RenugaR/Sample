package com.stepdefinition;

import com.utils.LibGlobal;

import cucumber.api.java.*;

public class Hooks extends LibGlobal{

	@Before
	public void before() {
		System.out.println("Before ");
		getDriver();
	}
	
	@After
	public void after() {
		System.out.println("After");
		closeBrowser();
	}
}
