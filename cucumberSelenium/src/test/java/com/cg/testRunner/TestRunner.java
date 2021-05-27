package com.cg.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "com.cg.stepdef", dryRun = true,
plugin = {"pretty", "json:target/cucumber.json", "html:target/index.html"}, tags = "@negative and @login")
public class TestRunner {
	

}
