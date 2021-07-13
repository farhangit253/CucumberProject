package com.amazonLogin.stepdefinitions;

import com.amazon.pageobject.AmazonLogoutPage;
import com.amazon.utilities.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLogoutStepdefinitions   {
	AmazonLogoutPage LogOut;
	
	@When("^user is going to clcik on Logout link$")
	public void user_is_going_to_clcik_on_Logout_link() throws Throwable {
		LogOut=new AmazonLogoutPage();
		LogOut.logOut();
	}

	@Then("^User should able to logOut$")
	public void user_should_able_to_logOut() throws Throwable {
	    LogOut.verifyTitle();
	    
	}

}
