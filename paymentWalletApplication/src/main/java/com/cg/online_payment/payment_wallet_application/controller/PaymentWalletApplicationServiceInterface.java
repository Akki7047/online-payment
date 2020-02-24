package com.cg.online_payment.payment_wallet_application.controller;

import com.cg.online_payment.payment_wallet_application.beans.PaymentWalletApplicationBean;
import com.cg.online_payment.payment_wallet_application.dao.PaymentWalletApplicationRepository;

public interface PaymentWalletApplicationServiceInterface {
	public void getUserName(PaymentWalletApplicationBean beanObj, PaymentWalletApplicationRepository repoObj);
	public void getPassword(PaymentWalletApplicationBean beanObj, PaymentWalletApplicationRepository repoObj);

public double getAmmount(PaymentWalletApplicationBean beanObj, PaymentWalletApplicationRepository repoObj);
}
