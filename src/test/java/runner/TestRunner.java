package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features=".",
glue="StepDefinition",
dryRun=false,
plugin= {"rerun:rerun/failed_scenario.txt"})
public class TestRunner {

	
}

//as a user I should be able to create account
//maven with testng
