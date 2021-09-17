package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue = {"Steps"},
		plugin = {"pretty", "html:Report2"},
		monochrome = true // it will give you a better format in output
		//tags = {"@P1"}
		//dryRun = True, //it will give you the missing step definition of features and their scenarios
		//strict = True //It's mandatory for scenarios to have step definition 
		)
public class TestRunner {

}
