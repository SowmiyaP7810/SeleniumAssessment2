package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/loginbank.feature", 
glue= {"stepdefinition"},dryRun=false,
monochrome= true,
plugin = {"pretty",
        "json:Reports.json",
        "html:Reports"}
		)


public class TestRunnerBankLogin {

}
