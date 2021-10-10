package com.tdd.ssn.service;

public class ValidateSSNService {

	public boolean checkSSN(String ssn) {

		if (ssn.length() == 11) {
			String[] arrSsn = ssn.split("-");

			if (arrSsn[0].equals("000")) {
				return false;
			}
		} else if (ssn.length() != 11) {
			throw new NumberFormatException("SSN String should have 11 characters");
		}

		return true;

	}

}
