package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class moduleRunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features= "src/features/module1"
			,glue= {"stepDefinitions"},
			plugin= {
					"html:reporting/CucumberHTMLReports/Sanity"
			}	
			)
	
	public class module1Runner{
		
	}
}


