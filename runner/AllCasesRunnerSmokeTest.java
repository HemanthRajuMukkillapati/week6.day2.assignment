package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/AllTestcasesLeaf.feature",glue="execution.hooks",monochrome=true,publish=true,tags = "@smoketest" )
public class AllCasesRunnerSmokeTest extends AbstractTestNGCucumberTests  {


}
