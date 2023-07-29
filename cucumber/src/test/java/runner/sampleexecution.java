package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src\\test\\resources\\feature",glue = {"StepDefinition"}, tags = "@Integrationtest" )
public class sampleexecution extends AbstractTestNGCucumberTests {

}
