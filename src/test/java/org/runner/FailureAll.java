package org.runner;



public class FailureAll implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotaion, class testclass, constructor testconstructor, method testmethod) {
		
	IRetryAnalyzer r = annotaion.getRetryAnalyzer();
	
	if(r==null) {
		annotation.setRetryAnlazyzer(FailureRunner.class)
	}
	}
