package com.amazon.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amazon.utilities.Base;

public class AmazonLogoutPage extends Base{
	
	public void logOut() {
		WebElement mouseover=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseover);
		WebElement logOut=driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]"));
		logOut.click();
	}
	public void verifyTitle() {
		String exptitle=driver.getTitle();
		Assert.assertEquals("Amazon Sign In", exptitle);
		System.out.println("successfully Logged out");
	}

}
