package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		features = {"src/test/resources/features"},
		glue= {"stepdefinition"},
		//tags = {"@cscart_search"},
		plugin ={"pretty" ,
				 "summary"},
		monochrome = true ,
		dryRun = false
		
		)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
	

}
