package com.ibm.mra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.mra.beans.Account;
import com.ibm.mra.dao.BalanceDao;

@Service("balanceService")
public class BalanceService {
	
	@Autowired
	BalanceDao dao;
	
	@Autowired
	Account acc;
	
	public Account getAccountDetails(String mobileNo){
		return dao.getAccountDetails(mobileNo);		
	}

	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		return dao.rechargeAccount(mobileNo, rechargeAmount);
	}

	public boolean validateNumber(String mobNumber) {
		return dao.validateNumber(mobNumber);
		
	}

}
