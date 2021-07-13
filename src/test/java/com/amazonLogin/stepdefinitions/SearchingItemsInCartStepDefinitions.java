package com.amazonLogin.stepdefinitions;

import com.amazon.pageobject.SearchingCartPage;
import com.amazon.utilities.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchingItemsInCartStepDefinitions extends Base {
	SearchingCartPage search;
	
	@When("^User is going to click Cart link in Homepage$")
	public void user_is_going_to_click_Cart_link_in_Homepage() throws Throwable {
		search=new SearchingCartPage();
		search.searchCart();
	    
	}

	@Then("^Items in the cart should visible$")
	public void items_in_the_cart_should_visible() throws Throwable {
		search=new SearchingCartPage();
		search.verifyLogo();
	}


}
