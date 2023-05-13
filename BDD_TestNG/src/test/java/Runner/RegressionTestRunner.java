package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
				glue= {"StepDefinition","AppHooks"},
				plugin= {"pretty", "json:target/cucumber.json","html:target/cucumber-reports"},
				tags = "@regression",
				monochrome=true,
				publish = true)
public class RegressionTestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
