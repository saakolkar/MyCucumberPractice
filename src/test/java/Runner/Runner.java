package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Fetures", glue = { "stepDefinations" }, plugin = { "pretty",
		"json:target/cucumber-reports/Cucumber.json" }, monochrome = true)
public class Runner {

}
