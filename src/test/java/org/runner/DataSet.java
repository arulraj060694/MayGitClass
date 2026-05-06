package org.runner;

import org.testng.annotations.DataProvider;

public class DataSet {
	
	// using data provider inside the class 
		@DataProvider(name="SampleData")
		public Object[][] data() {
			return new Object[][] {
					{"abc","sdbhsbf@gmail.com"},
					{"cdefg"," dsmfndsj@gmail.com"},
					{"bfgfbgf","dsfnjf@gmail.com"}
					
			};
			
			
			
		}

}
