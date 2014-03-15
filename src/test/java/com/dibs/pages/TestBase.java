package com.dibs.pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.dibs.applogic.ApplicationManager;
import com.dibs.applogic2.ApplicationManager2;


public class TestBase {
	protected ApplicationManager app;

	@BeforeClass
	public void init() {
		app = new ApplicationManager2();
	}

	@AfterSuite
	public void stop() {
		app.stop();
	}
}
