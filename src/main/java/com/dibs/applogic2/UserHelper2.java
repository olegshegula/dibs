package com.dibs.applogic2;

import com.dibs.applogic.UserHelper;
import com.dibs.model.Links;

public class UserHelper2 extends DriverBasedHelper implements UserHelper {

	public UserHelper2(ApplicationManager2 manager) {
		super(manager.getWebDriver());
	}

	@Override
	public boolean isCardPaymentExist(Links cardPaymentAtr) {
		return pages.solutionsPage.ensurePageLoaded()
		 .getCardPaymentAtr().contains(cardPaymentAtr.getLinkatribut());
		 
	}

	@Override
	public boolean isInvocePaymentExist(Links invocePaymentAtr) {
		
		return pages.solutionsPage.ensurePageLoaded()
				.getInvocePaymentAtr().contains(invocePaymentAtr.getLinkatribut());
	}

	@Override
	public boolean isBankPaymentExist(Links bankPaymentAtr) {
		
		return pages.solutionsPage.ensurePageLoaded()
				.getBankPaymentAtr().contains(bankPaymentAtr.getLinkatribut());
	}

	
}
