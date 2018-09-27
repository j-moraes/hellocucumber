package hellocucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath: test/resources", glue ="hellocucumber", monochrome = true, dryRun = false)
public class IsItFridayTest {

}
