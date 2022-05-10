package runner;


import failed.passedSDs.BaseClass;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/DuplicateLead.feature",glue="failed.passedSDs",monochrome=true,publish=true)
public class DuplicateLeadRunnerFailed extends BaseClass {

}
