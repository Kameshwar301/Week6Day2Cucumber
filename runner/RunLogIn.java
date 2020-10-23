package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features", glue ="steps",tags = {"@FunctionalTest"}, monochrome = true)
public class RunLogIn extends AbstractTestNGCucumberTests {

}
 