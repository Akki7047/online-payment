package com.cg.online_payment.payment_wallet_application.dao;

import java.util.ArrayList;
import java.util.List;

public class PaymentWalletApplicationRepository {

	public List<String> nameList = new ArrayList<String>(); 
	{
		nameList.add("Rohan");
		nameList.add("Mayank");
	}
	public List<String> passList = new ArrayList<String>();{
		passList.add("HiRohan");
		passList.add("HiMayank");
	}
	public List<Double> balanceList = new ArrayList<Double>();{
		balanceList.add(33000.00);
		balanceList.add(435334.00);
	}
	public List<Double> newBalanceList = new ArrayList<Double>();{
		balanceList.add(33000.00);
		balanceList.add(435334.00);
	}
}
