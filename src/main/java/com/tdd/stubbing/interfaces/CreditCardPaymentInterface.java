package com.tdd.stubbing.interfaces;

import com.tdd.stubbing.entity.CreditCard;


public interface CreditCardPaymentInterface {
	
	public CreditCard lookup(Long creditCardNumber, Integer oneTimePassword);

}
