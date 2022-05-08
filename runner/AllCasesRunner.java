package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/AllTestcasesLeaf.feature",glue="execution.hooks",monochrome=true,publish=true,
tags ="@deletelead" )//tags ="@functional"
public class AllCasesRunner extends AbstractTestNGCucumberTests  {


}
