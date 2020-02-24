package paymentWalletApplication;

import static org.junit.Assert.assertEquals;

import com.cg.online_payment.payment_wallet_application.beans.PaymentWalletApplicationBean;
import com.cg.online_payment.payment_wallet_application.dao.PaymentWalletApplicationRepository;
import com.cg.online_payment.payment_wallet_application.service.PaymentWalletApplication;

public class PaymentWalletApplicationTest{
	
@org.junit.Test
public void testMethode1(){
	PaymentWalletApplicationBean beanObj = new PaymentWalletApplicationBean();
	PaymentWalletApplication serviceObj = new PaymentWalletApplication();
	PaymentWalletApplicationRepository repoObj = new PaymentWalletApplicationRepository();
	beanObj.setAmmount(10000.00);
	assertEquals(serviceObj.getAmmount(beanObj, repoObj),43000.0,1 );
}

}
