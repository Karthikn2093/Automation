package testPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	public int count = 0;
	public int maxCount = 2;
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && count < maxCount) {
			
			count++;
			return true;
		}
		
		return false;
	}

}
