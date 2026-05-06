package org.page;

import org.baseClass.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class DashBoard extends BaseClass {
	public DashBoard() {
		PageFactory.initElements(getDriver(), this);
	}
	
}
