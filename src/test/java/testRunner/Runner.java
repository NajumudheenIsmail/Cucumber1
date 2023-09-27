package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;




@RunWith(Cucumber.class)
@CucumberOptions (
		
		features = {"src/test/java/Features/Login.feature"},
		dryRun=!true,
		glue = "Step",
		//snippets=SnippetType.CAMELCASE,
		
		plugin = {"pretty", "html:report", "json:reports/result.json"}
		)


public class Runner extends AbstractTestNGCucumberTests  {
	
	
	

}
