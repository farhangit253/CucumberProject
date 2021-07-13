package com.amazon.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.amazon.utilities.Base;

public class SearchingCartPage extends Base{
	
	public void searchCart() {
		WebElement searchcart=driver.findElement(By.xpath("//a[@id='nav-cart']"));
		searchcart.click();
	}
	public void verifyLogo() {
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]//*[contains(text(),'Shopping Cart')]"));
		if(logo.isDisplayed()) {
			System.out.println("Cart Logo verified succesfully");
		}else {
			System.out.println("Logo not verified");
		}
		
	}

}
