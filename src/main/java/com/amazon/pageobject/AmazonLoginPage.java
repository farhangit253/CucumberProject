package com.amazon.pageobject;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import com.amazon.utilities.Base;

public class AmazonLoginPage extends Base {
	
	
	
		public void signIn() {
		WebElement clickSignIn=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		clickSignIn.click();
		
		}
	
	    public void enterUser(String uid) {
		WebElement UserName=driver.findElement(By.xpath("//input[@name='email']"));
		UserName.sendKeys(uid);
		
	    }
		public void next() {
		WebElement next=driver.findElement(By.xpath("//input[@id='continue']"));
		next.click();
		
		}
		public void enterPassword(String pwd) {
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pwd);
		
		}
		public void submit() {
		WebElement submit=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		submit.click();
		
		}

       
}	


	
		
	
	




