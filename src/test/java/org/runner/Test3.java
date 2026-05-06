package org.runner;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test3 {
	
	
	@Test
	public void tc2() {
		System.out.println("tc2");
	}
	
	@Test
	public void tc4() {
		System.out.println("tc4");
		Assert.assertTrue(false);
		System.out.println("tc10");
	}
	@Test
	public void tc6() {
		System.out.println("tc6");
	}
	
}
