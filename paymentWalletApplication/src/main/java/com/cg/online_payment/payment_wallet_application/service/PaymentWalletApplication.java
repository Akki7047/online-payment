package com.cg.online_payment.payment_wallet_application.service;

import com.cg.online_payment.payment_wallet_application.beans.PaymentWalletApplicationBean;
import com.cg.online_payment.payment_wallet_application.controller.PaymentWalletApplicationServiceInterface;
import com.cg.online_payment.payment_wallet_application.dao.PaymentWalletApplicationRepository;

public class PaymentWalletApplication implements PaymentWalletApplicationServiceInterface {
	 int  size;
    boolean flag = true;
	public void getUserName(PaymentWalletApplicationBean beanObj, PaymentWalletApplicationRepository repoObj) {
		
		for( size=0; size<repoObj.nameList.size(); size++) {
			if(repoObj.nameList.get(size).equals(beanObj.getUserName())) {
			flag=true;
				break;	
			}else {
				flag=false;
			}
		
	}if(!flag)
	{
		System.out.println("wrong user name");
		System.exit(0);
	}
		}
	public void getPassword(PaymentWalletApplicationBean beanObj, PaymentWalletApplicationRepository repoObj) {
	
		if(repoObj.passList.get(size).equals(beanObj.getPassword())) {
			
			
		}
	else {
			System.out.println("wrong password");
			System.exit(0);
			
		}
	}
public double getAmmount(PaymentWalletApplicationBean beanObj, PaymentWalletApplicationRepository repoObj) {
	repoObj.newBalanceList.add(repoObj.balanceList.get(size) + beanObj.getAmmount());
	System.out.println("your updated balance is:");
	System.out.println(repoObj.newBalanceList.get(0));
	return repoObj.newBalanceList.get(0);
}

   }