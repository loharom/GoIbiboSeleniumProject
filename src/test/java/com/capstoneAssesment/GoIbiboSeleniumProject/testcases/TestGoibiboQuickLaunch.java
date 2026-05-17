package com.capstoneAssesment.GoIbiboSeleniumProject.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.capstoneAssesment.GoIbiboSeleniumProject.pages.LoginPage;
import com.capstoneAssesment.GoIbiboSeleniumProject.testcases.BaseTest;

public class TestGoibiboQuickLaunch extends BaseTest{
	@Test(description = "Simple test to launch Goibibo Flight ticket Website")
	public void test(){
		
		LoginPage login = new LoginPage(driver);
	}

}
