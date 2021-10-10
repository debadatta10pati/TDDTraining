package com.tdd.stubbing.interfaces;

import com.tdd.stubbing.entity.CreditReport;

public interface CreditVerificationInterface {
	
	public CreditReport lookup(Long ssn);

}
