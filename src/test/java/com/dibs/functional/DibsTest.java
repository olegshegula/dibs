package com.dibs.functional;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dibs.model.Links;
import com.dibs.pages.TestBase;

public class DibsTest extends TestBase {
	@Test
	public void testDibsSolutionsOK() throws Exception {

		Links cardPaymentAtr = new Links()
				.setLinkatribut("http://www.dibspayment.com/card_payments");
		Links invocePaymentAtr = new Links()
				.setLinkatribut("http://www.dibspayment.com/invoice");
		Links bankPaymentAtr = new Links()
				.setLinkatribut("http://www.dibspayment.com/bank_payments");

		app.getNavigationHelper().openMainPage();
		app.getClickLinkHelper().clickOnSolutionsFooterLink();
		Assert.assertTrue(app.getUserHelper()
				.isCardPaymentExist(cardPaymentAtr));
		Assert.assertTrue(app.getUserHelper().isInvocePaymentExist(
				invocePaymentAtr));
		Assert.assertTrue(app.getUserHelper()
				.isBankPaymentExist(bankPaymentAtr));
	}
}
