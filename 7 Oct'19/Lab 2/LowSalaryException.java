package com.cg.eis.exception; 

public class LowSalaryException extends Exception {

	public String msg = "";
	public int salary;

	public LowSalaryException(int salary){
		this.salary = salary;
	}

	@Override
	public String toString(){
		if(salary < 3000)
			msg = "Your salary is very low.";
		return msg;
	} 
}