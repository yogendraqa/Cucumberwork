package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue = {"Steps"},
		
		monochrome = true, // it will give you a better format in output
		tags = "@P3"
		//plugin = {"pretty", "html:Report2"},
	    //dryRun = true //it will give you the missing step definition of features and their scenarios
		//strict = True //It's mandatory for scenarios to have step definition 
		)
public class TestRunner {

}
