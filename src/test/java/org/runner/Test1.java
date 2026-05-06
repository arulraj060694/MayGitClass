package org.runner;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test1 {

	@Test
	public void tc3() {
		System.out.println(" tc1");
		System.out.println(" tc2");
		System.out.println(" tc3");
		System.out.println(" tc4");
		System.out.println(" tc5");

	}

	
	
	@Test(retryAnalyzer = FailureRunner.class)
	public void tc1() {
		System.out.println(" tc6");
		Assert.assertTrue(false);
		System.out.println(" tc7");
		System.out.println(" tc8");
		System.out.println(" tc9");
		System.out.println(" tc10");
		System.out.println(" tc11");

	}
}
