package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//FeatureFiles", glue = "com.stepdefinition", monochrome = true, dryRun = false, tags = {
		"~@login" })
public class TestRunner {

}
