package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//FeatureFiles", 
glue = "com.stepdefinition", 
monochrome = true, 
dryRun = false, 
tags = {"@TC01" }, 
strict = false, 
plugin = {"pretty","junit:target//Reports//data.xml","json:target/Reports/data.json"}, 
snippets = SnippetType.CAMELCASE)
public class TestRunner {

}
