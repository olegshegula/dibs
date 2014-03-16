package com.dibs.applogic2;

import com.dibs.applogic.UserHelper;
import com.dibs.model.Links;
import com.dibs.model.Support;

public class UserHelper2 extends DriverBasedHelper implements UserHelper {

	public UserHelper2(ApplicationManager2 manager) {
		super(manager.getWebDriver());
	}

	@Override
	public boolean isCardPaymentExist(Links cardPaymentAtr) {
		return pages.solutionsPage.ensurePageLoaded().getCardPaymentAtr()
				.equals(cardPaymentAtr.getLinkatribut());

	}

	@Override
	public boolean isInvocePaymentExist(Links invocePaymentAtr) {

		return pages.solutionsPage.ensurePageLoaded().getInvocePaymentAtr()
				.equals(invocePaymentAtr.getLinkatribut());
	}

	@Override
	public boolean isBankPaymentExist(Links bankPaymentAtr) {

		return pages.solutionsPage.ensurePageLoaded().getBankPaymentAtr()
				.equals(bankPaymentAtr.getLinkatribut());
	}

	@Override
	public void search(String text) {
		pages.solutionsPage.ensurePageLoaded().enableInputSearchFieldClick()
				.setSeachField(text).searchBtnClick();

	}

	@Override
	public boolean checkSupportInfo(Support supportphone, Support title, Support openhours) {
		
		return pages.customersupportPage.ensurePageLoaded().getPhone()
				.equals(supportphone.getPhone()) 
				&& pages.customersupportPage.getTitle().equals(title.getTitle())
				&& pages.customersupportPage.getOpenHours().equals(openhours.getHours());

	}
}
