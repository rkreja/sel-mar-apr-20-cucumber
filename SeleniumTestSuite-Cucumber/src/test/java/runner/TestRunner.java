package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		
		features = {"feature/search.feature"},
		glue = {"stepDefinations"},
		tags = {"@smoke"}
		
		)
public class TestRunner {

}
