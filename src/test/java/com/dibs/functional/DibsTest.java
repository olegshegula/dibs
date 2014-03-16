package com.dibs.functional;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dibs.model.Links;
import com.dibs.model.Support;
import com.dibs.pages.TestBase;

public class DibsTest extends TestBase {
	@Test
	public void testDibsSolutionsOK() throws Exception {
		// Prepare test data
		Links cardPaymentAtr = new Links()
				.setLinkatribut("http://www.dibspayment.com/card_payments");
		Links invocePaymentAtr = new Links()
				.setLinkatribut("http://www.dibspayment.com/invoice");
		Links bankPaymentAtr = new Links()
				.setLinkatribut("http://www.dibspayment.com/bank_payments");
		Support supportphone = new Support().setPhone("+46 (0)8-527 525 00");
		Support title = new Support().setTitle("We answer all your questions");
		Support openhours = new Support()
				.setHours("Opening hours:" + "\n"
						+ "Monday - Thursday 9.00 - 17.00" + "\n"
						+ "Friday 9.00-16.00");

		// Test Steps

		app.getNavigationHelper().openMainPage();
		app.getClickLinkHelper().clickOnSolutionsFooterLink();
		Assert.assertTrue(app.getUserHelper()
				.isCardPaymentExist(cardPaymentAtr));
		Assert.assertTrue(app.getUserHelper().isInvocePaymentExist(
				invocePaymentAtr));
		Assert.assertTrue(app.getUserHelper()
				.isBankPaymentExist(bankPaymentAtr));

		app.getUserHelper().search("customer support");
		app.getClickLinkHelper().clickOnCustomerSupportLink();
		Assert.assertTrue(app.getUserHelper().checkSupportInfo(supportphone,
				title, openhours));

	}
}
