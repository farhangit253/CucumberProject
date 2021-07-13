package com.amazon.utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	 public static Properties prop;
	 protected static WebDriver driver;
	
		public  Base() {
			try{
				prop=new Properties();
				FileInputStream fi=new FileInputStream("C:\\selenium2\\Cucumber-Amazon\\src\\main\\java\\com\\amazon\\properties\\config.properties");
				prop.load(fi);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
	 
	
	 
	public static void browserInitialization() {
		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverpath"));
		driver=new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	public static void quitBrowser() {
		driver.close();
	}

}
