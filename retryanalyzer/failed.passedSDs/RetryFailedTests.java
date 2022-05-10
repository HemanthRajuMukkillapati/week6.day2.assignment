package failed.passedSDs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

	int retrycount = 0;

	@Override
	public boolean retry(ITestResult result) {
		//added code for overridden
		//executes 2 times if test case is failed
		if (retrycount < 2) 
		{ 
			retrycount++;
			return true;
		}
		return false;
	}

}
