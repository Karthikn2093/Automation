package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features",glue="steps",
				 monochrome = true
				)
public class RunTest extends AbstractTestNGCucumberTests{
	
	

}
