package com.tdd.stubbing.entity;

public class CreditCard {
	
	private long creditCardNumber;
	
	private int cvvCode;
	
	private String name;
	
	private int oneTimePassword;

	public CreditCard(long creditCardNumber, int cvvCode, String name, int oneTimePassword) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.cvvCode = cvvCode;
		this.name = name;
		this.oneTimePassword = oneTimePassword;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getCvvCode() {
		return cvvCode;
	}

	public void setCvvCode(int cvvCode) {
		this.cvvCode = cvvCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOneTimePassword() {
		return oneTimePassword;
	}

	public void setOneTimePassword(int oneTimePassword) {
		this.oneTimePassword = oneTimePassword;
	} 

	
	

}
