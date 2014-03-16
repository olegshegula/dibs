package com.dibs.applogic;

import com.dibs.model.Links;
import com.dibs.model.Support;

public interface UserHelper {	
	boolean isCardPaymentExist(Links cardPaymentAtr);
	boolean isInvocePaymentExist(Links invocePaymentAtr);
	boolean isBankPaymentExist(Links bankPaymentAtr);
	void search(String text);
	boolean checkSupportInfo(Support supportphone,Support title, Support openhours);
}
