package eCommerce.adapters;

import eCommerce.business.concretes.GoogleRegistrationManager;
import eCommerce.core.SignUpService;

public class GoogleRegistrationManagerAdapters implements SignUpService{

	@Override
	public void signUpToSystem() {
		GoogleRegistrationManager googleRegistrationManager = new GoogleRegistrationManager();
		googleRegistrationManager.signUp();
		
	}

}
