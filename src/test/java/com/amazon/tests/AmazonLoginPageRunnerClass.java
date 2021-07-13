package com.amazon.tests;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue = {"com.amazonLogin.stepdefinitions"},
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent reports/report.html",
"pretty","junit:target/MyReports/report.xml","html:target/cucumber-html-report",
	"json:target/MyReports/report.json"},monochrome=true)
public class AmazonLoginPageRunnerClass {

	@AfterClass
	public static void extentReport() {
		  Reporter.loadXMLConfig(new File(com.amazon.managers.FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		
}
}
