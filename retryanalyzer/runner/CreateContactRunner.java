package runner;


import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features="src/test/java/features",glue={"steps"},monochrome=true,publish=true, tags="@regression" )
public class CreateContactRunner extends BaseClass {
	

}
