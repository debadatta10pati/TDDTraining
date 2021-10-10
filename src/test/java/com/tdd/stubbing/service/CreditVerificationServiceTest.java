package com.tdd.stubbing.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tdd.stubbing.entity.CreditReport;
import com.tdd.stubbing.interfaces.CreditVerificationInterface;

class CreditVerificationServiceTest {

	@Test
	public void testForApprovalBasedOnCreditReport() {
		
		CreditVerificationInterface creditVerificationInterface = new CreditVerificationInterface() {

			
			public CreditReport lookup(Long ssn) {
				
				return new CreditReport(ssn, 800, 15000, "Car");
			}
			
		};
		
		CreditVerificationService creditService = new CreditVerificationService();
		
		creditService.setCreditVerificationInterface(creditVerificationInterface);
		
		long ssn =890890101;
		
		String approval = creditService.getApproval(ssn);
		
		assertEquals("Yes",approval);
	
	}

}
