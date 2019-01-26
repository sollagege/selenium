package Runner;

import cucumber.api.CucumberOptions;
import tests.TestBase;


@CucumberOptions(features="src/test/java/Features",
glue= {"Steps"},
plugin= {"pretty","html:target/cucumber-html-report"})
public class userrunner extends TestBase {
	

}
