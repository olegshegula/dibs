package com.dibs.functional;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.dibs.pages.TestBase;

public class DibsTest extends TestBase {
	  @Test
	  public void testDibsSolutionsOK() throws Exception {
		  app.getNavigationHelper().openMainPage();
		  app.getClickLinkHelper().clickOnSolutionsFooterLink();
	  }
}
