package com.cg.online_payment.payment_wallet_application.client;

import java.util.Scanner;

import com.cg.online_payment.payment_wallet_application.beans.PaymentWalletApplicationBean;
import com.cg.online_payment.payment_wallet_application.dao.PaymentWalletApplicationRepository;
import com.cg.online_payment.payment_wallet_application.service.PaymentWalletApplication;

public class Source {

	public static void main(String[] args) {
		PaymentWalletApplicationBean beanObj = new PaymentWalletApplicationBean();
		PaymentWalletApplication serviceObj = new PaymentWalletApplication();
		PaymentWalletApplicationRepository repoObj = new PaymentWalletApplicationRepository();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String userName = sc.nextLine();
		beanObj.setUserName(userName);
		serviceObj.getUserName(beanObj, repoObj);
		System.out.println("Enter your password");
		String password = sc.nextLine();
		beanObj.setPassword(password);
		serviceObj.getPassword(beanObj, repoObj);
		System.out.println("hi  "+userName+"->");
		System.out.println("enter ammount that you want to add in your account");
		Scanner sc1 = new Scanner(System.in);
		beanObj.setAmmount(sc1.nextDouble());
		serviceObj.getAmmount(beanObj, repoObj);
		
	}

}
