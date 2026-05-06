package org.stepdefinition;

import org.baseClass.BaseClass;
import org.prob.Proberties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	BaseClass b = new BaseClass();
	@Given("usre should open the application")
	public void usre_should_open_the_application() {
	  
		
		b.getBrowser(Proberties.Chrome);
		b.launchURL(Proberties.url);
	}
	@When("user should enter the {string} and {string}")
	public void user_should_enter_the_and(String string, String string2) {
	   System.out.println(string);
	   System.out.println(string2);
	   
	}
	@Then("verifiying the home page")
	public void verifiying_the_home_page() {
	    System.out.println("Then");
	}


}
