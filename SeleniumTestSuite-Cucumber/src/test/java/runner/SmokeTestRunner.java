package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		
		features = {"feature"},
		glue = {"stepDefinations"},
		tags = {"@smoke"},
		plugin = {"pretty","html:target/cucumber-report"}
//		plugin = {"pretty","json:target/cucumber-report.json"}
		
		)
public class SmokeTestRunner {

}
