package com.tdd.stubbing.service;

import com.tdd.stubbing.entity.CreditReport;
import com.tdd.stubbing.interfaces.CreditVerificationInterface;

public class CreditVerificationService {

	private CreditVerificationInterface creditVerificationInterface;

	public void setCreditVerificationInterface(CreditVerificationInterface creditVerificationInterface) {
		this.creditVerificationInterface = creditVerificationInterface;
	}

	public String getApproval(Long ssn) {
		CreditReport creditReport = creditVerificationInterface.lookup(ssn);
		String approval = null;

		if (creditReport.getLoanType().equalsIgnoreCase("Personal") && (creditReport.getLoanAmount() < 10000)
				&& (creditReport.getCreditScore() > 700)) {
			approval = "Yes";
		}
		else if (creditReport.getLoanType().equalsIgnoreCase("Car") && (creditReport.getLoanAmount() < 100000)
				&& (creditReport.getCreditScore() > 600)) {
			approval = "Yes";
		}
		else if (creditReport.getLoanType().equalsIgnoreCase("Home") && (creditReport.getLoanAmount() < 20000)
				&& (creditReport.getCreditScore() > 600)) {
			approval = "Yes";
		}
		else
		{
			approval = "Maybe";
		}

		return approval;
	}

}
