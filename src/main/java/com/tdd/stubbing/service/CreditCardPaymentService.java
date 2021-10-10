package com.tdd.stubbing.service;

import com.tdd.stubbing.entity.CreditCard;
import com.tdd.stubbing.interfaces.CreditCardPaymentInterface;

public class CreditCardPaymentService {


	private CreditCardPaymentInterface creditCardPaymentInterface;
	

	public void setCreditCardPaymentInterface(CreditCardPaymentInterface creditCardPaymentInterface) {
		this.creditCardPaymentInterface = creditCardPaymentInterface;
	}




	public String verifyCardInfo(Long creditCardNumber, String name, int cvvCode, Integer otp) {
		
		CreditCard creditCard = creditCardPaymentInterface.lookup(creditCardNumber,otp);

		String verificationStatus = null;
		
		if((creditCard.getName().equals(name))&&(creditCard.getCvvCode()==cvvCode))
			
		{
			verificationStatus="Verified";
		}
		else
		{
			verificationStatus="Unverified";
		}

		return verificationStatus;
	}

}
