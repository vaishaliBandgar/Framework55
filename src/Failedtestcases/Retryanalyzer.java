package Failedtestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyzer implements IRetryAnalyzer {
	
	int count=0;
	int Retrylimit =3;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<Retrylimit) {
			count++;
			return true;
		}
		
		return false;
	}

}
