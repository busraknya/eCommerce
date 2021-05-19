package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.VerificationService;
import eCommerce.core.SignUpService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private VerificationService verificationService;
	private UserDao userDao;
	private SignUpService signUpService;
		
	public UserManager() {
		
	}

	public UserManager(VerificationService verificationService, UserDao userDao, SignUpService signUpService) {
		super();
		this.verificationService = verificationService;
		this.userDao = userDao;
		this.signUpService = signUpService;
	}

	@Override
	public void signUp(User user) {
		
		if(verificationService.firstNameIsVerified(user) == true &&
				verificationService.lastNameIsVerified(user) == true &&
				verificationService.eMailIsVerified(user) == true &&
				verificationService.passwordIsVerified(user) == true) {
			
			System.out.println("Email ve þifreniz onaylandý.");
			this.userDao.add(user);
			this.signUpService.signUpToSystem();
		} else {
			System.out.println("Lütfen emailinizi ve þifrenizi kontrol edin.");
		}
	}

	@Override
	public void logIn(User user, String mail, String password) {
		
		if (mail == user.getEmail() && password == user.getPassword()) {
			System.out.println("Sisteme giriþ yapýldý");
		} else {
			System.out.println("Mail adresinizi veya þifrenizi yanlýþ girdiniz");
		}
	}

}
