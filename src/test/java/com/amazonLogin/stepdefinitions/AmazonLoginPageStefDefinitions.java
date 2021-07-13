package com.amazonLogin.stepdefinitions;

import java.util.List;

import org.junit.Assert;

import com.amazon.pageobject.AmazonLoginPage;
import com.amazon.utilities.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonLoginPageStefDefinitions extends Base  {
	
	AmazonLoginPage login;
	

	@Given("^Open chromebrowser and type amazon url$")
	public void open_chromebrowser_and_type_amazon_url() throws Throwable {
	  Base.browserInitialization();
	}

	@Then("^User clicks on SignIn link$")
	public void user_clicks_on_SignIn_link() throws Throwable {
	   login=new AmazonLoginPage();
	   login.signIn();
	   
	}

	@When("^User is going to enter below username$")
	public void user_is_going_to_enter_below_username(DataTable arg1) throws Throwable {
		List<String>username=arg1.asList(String.class);
		login=new AmazonLoginPage();
	    login.enterUser(username.get(0));
	}

	@Then("^User should click on next button$")
	public void user_should_click_on_next_button() throws Throwable {
		login=new AmazonLoginPage();
	   login.next();
	}

	@When("^User is going to enter below password$")
	public void user_is_going_to_enter_below_password(DataTable arg1) throws Throwable {
		List<String>password=arg1.asList(String.class);
		login=new AmazonLoginPage();
		login.enterPassword(password.get(0));
		
	}

	@Then("^User should click the submit button$")
	public void user_should_click_the_submit_button() throws Throwable {
		login=new AmazonLoginPage();
		
	   login.submit();
	   Assert.assertTrue("https://www.amazon.in/?ref_=nav_ya_signin&", true);
	   System.out.println("valid credentials");
	   
	}


}
