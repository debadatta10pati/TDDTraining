package com.tdd.repeatedtests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import com.tdd.stubbing.entity.CreditCard;
import com.tdd.stubbing.interfaces.CreditCardPaymentInterface;
import com.tdd.stubbing.service.CreditCardPaymentService;

class JUnitRepeatedTest {

	@DisplayName("Testcase for one time password tests")
	@RepeatedTest(2)
	void verifyOneTimePasswordResetForCreditCards() {
		
		CreditCardPaymentInterface CreditCardPaymentInterface = new CreditCardPaymentInterface() {

			@Override
			public CreditCard lookup(Long creditCardNumber, Integer oneTimePassword) {
				// TODO Auto-generated method stub
				return new CreditCard(creditCardNumber, 459, "Deba", oneTimePassword);
			}

			
		};
		

		long creditCardNumber = 9091234;
		
		int otp = 120891;
		
		CreditCardPaymentService creditCardPaymentService = new CreditCardPaymentService();
		
		creditCardPaymentService.setCreditCardPaymentInterface(CreditCardPaymentInterface);
		
		String status = creditCardPaymentService.verifyCardInfo(creditCardNumber, "Deba", 459,otp);
			
		assertEquals("Verified",status);

	}

}
