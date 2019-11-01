package com.ibm.mra.beans;

import org.springframework.stereotype.Service;

@Service
public class Account {
	private String customerName;
	private long mobileNumber;
	private double accountBalance;
	private String accountType;
	
	public Account(String customerName, long mobileNumber, double accountBalance, String accountType) {
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}
	
	public Account() {

	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "" + accountBalance ;
	}
	
}
