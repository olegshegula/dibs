package com.dibs.applogic;

import com.dibs.model.Links;

public interface UserHelper {	
	boolean isCardPaymentExist(Links cardPaymentAtr);
	boolean isInvocePaymentExist(Links invocePaymentAtr);
	boolean isBankPaymentExist(Links bankPaymentAtr);

}
