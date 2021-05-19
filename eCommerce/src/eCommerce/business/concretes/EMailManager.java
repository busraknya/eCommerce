package eCommerce.business.concretes;

import eCommerce.business.abstracts.EMailService;

public class EMailManager implements EMailService {

	@Override
	public void verify() {
		System.out.println("Mail adresi doðrulanmýþtýr.");
		
	}

	@Override
	public void send() {
		
		System.out.println("Doðrulama linki gönderilmiþtir.");
	}

}
