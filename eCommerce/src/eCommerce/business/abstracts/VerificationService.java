package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface VerificationService {
	
	boolean firstNameIsVerified(User user);
	boolean lastNameIsVerified(User user);
	boolean eMailIsVerified(User user);
	boolean passwordIsVerified(User user);
}
