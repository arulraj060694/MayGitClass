package org.runner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailureRunner implements IRetryAnalyzer {

	int min = 0;
	int max = 3;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
        if(min<max) {
        	min++;
        	return true;
        }
		return false;
	}

}
