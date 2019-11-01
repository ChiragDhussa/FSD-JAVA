package com.ibm.mra.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ibm.mra.service.BalanceService;

public class Recharge {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BalanceService serv = context.getBean("balanceService", BalanceService.class);

//		dao.addNewUser(new Account("Mohit", Long.valueOf("7087092379"), 50,"Postpaid"));

		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("1. Account Balance Enquiry\n2. Recharge Amount\n3. Exit");
				int input = sc.nextInt();
				switch (input) {
				case 1:
					int flag = 1;
					while (flag > 0) {
						System.out.print("Enter Mobile Number: ");
						long num = sc.nextLong();
						String mobNumber = String.valueOf(num);
						if (mobNumber.length() != 10) {
							System.out.println("Please enter mobile number of 10 digits.");
							
						} else {
							if (serv.validateNumber(mobNumber) == true) {
								flag = 0;
								System.out.println("Your Current Balance is: Rs. " + serv.getAccountDetails(mobNumber));
							} else
								System.out.println("Given Account Id Does Not Exists");
						}
					}

					break;
				case 2:
					int temp = 1;
					while (temp > 0) {
						System.out.print("Enter Mobile Number: ");
						long number = sc.nextLong();
						String numb = String.valueOf(number);
						if (numb.length() != 10) {
							System.out.println("Please enter mobile number of 10 digits.");
						} else {
							if (serv.validateNumber(numb) == true) {
								flag = 0;
								System.out.print("Enter Recharge Amount: ");
								int recharge = sc.nextInt();
								String mobileNumber = String.valueOf(number);
								serv.rechargeAccount(mobileNumber, Double.valueOf(recharge));
								System.out.println("Your Account Recharge Successfully.");
								System.out.println("Available balance is Rs. " + serv.getAccountDetails(numb));
							} else
								System.out.println("ERROR: Cannot Recharge Account as Given Mobile No Does Not Exists");

						}
					}

					break;
				case 3:
					System.exit(0);
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter input in correct manner.");
			}
		}
	}
}