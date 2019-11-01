package com.ibm.mra.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.mra.beans.Account;

@Repository("balanceDao")
public class BalanceDao {
	DataSource dataSource;
	NamedParameterJdbcTemplate namedTemp;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Autowired
	Account acc;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		namedTemp = new NamedParameterJdbcTemplate(dataSource);
	}
	
//	public void addNewUser(Account acc) {
//
//		String qry = "insert into customerDetails(customerName, mobileNumber, accountBalance, accountType) "
//				+ "values (:cName, :mNum, :accBal, :accType)";
//		
//		namedTemp.update(qry, new MapSqlParameterSource("cName", acc.getCustomerName())
//				.addValue("mNum", acc.getMobileNumber())
//				.addValue("accBal", acc.getAccountBalance())
//				.addValue("accType", acc.getAccountType()));
//	}
	
	public Account getAccountDetails(String mobileNo) {
		String qry = "select accountBalance from customerDetails where mobileNumber = :mNum";
		long mob = Long.valueOf(mobileNo);
		return namedTemp.queryForObject(qry, new MapSqlParameterSource("mNum", mob), new UserMapper());
	}
	
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		
		String qry = "select accountBalance from customerDetails where mobileNumber = :mNum";
		long mob = Long.valueOf(mobileNo);
		int i = namedTemp.queryForObject(qry, new MapSqlParameterSource("mNum", mob), Integer.class);
		{
			double newBal = i + rechargeAmount;
			String qry2 = "update customerDetails SET accountBalance = :newB where mobileNumber = :mNum";
			namedTemp.update(qry2, new MapSqlParameterSource("newB", newBal)
					 .addValue("mNum", mobileNo));
		}
		return 0;
	}

	public boolean validateNumber(String mobNumber) {
		String qry = "select mobileNumber from customerDetails where mobileNumber = :mNum";
		try {
		String s = namedTemp.queryForObject(qry, new MapSqlParameterSource("mNum", mobNumber), String.class);
		if(s.length()==0 && s.equals(null)) {
			return false;
		}
		else
			return true;
		}
		catch (EmptyResultDataAccessException e) {
			return false;
		}
	}
//	
//	public void updateBalance(int balance, int newBal, long mNumber) {
//		int newBalance = balance + newBal;
//		String qry = "update customerDetails SET accountBalance = :newB where mobileNumber = :mNum";
//		namedTemp.update(qry, new MapSqlParameterSource("newB", newBalance)
//				.addValue("mNum", mNumber));
//	}
	
	class UserMapper implements RowMapper<Account> {

		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			acc.setAccountBalance(rs.getDouble("accountBalance"));
			return acc;
			}
		}

    }
