package com.tdd.stubbing.entity;

public class CreditReport {
	
	private long ssn;
	
	private int creditScore;
	
	private long loanAmount;
	
	private String loanType;
	
	

	public CreditReport(long ssn, int creditScore, long loanAmount, String loanType) {
		super();
		this.ssn = ssn;
		this.creditScore = creditScore;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
	}

	public long getSsn() {
		return ssn;
	}

	public void setSsn(long ssn) {
		this.ssn = ssn;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
	

}
