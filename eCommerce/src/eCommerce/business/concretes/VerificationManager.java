package eCommerce.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.VerificationService;
import eCommerce.entities.concretes.User;

public class VerificationManager implements VerificationService {

	@Override
	public boolean firstNameIsVerified(User user) {
		if (user.getFirstName().length() >= 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean lastNameIsVerified(User user) {
		if (user.getLastName().length() >= 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean eMailIsVerified(User user) {
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches() == true) {
			return true;
		}

		return false;
	}

	@Override
	public boolean passwordIsVerified(User user) {
		if (user.getPassword().length() >= 6) {
			return true;
		}
		return false;
	}

}
