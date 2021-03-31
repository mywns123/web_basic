package web_basic_jsp_12;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GoogleAuthentication extends Authenticator {
	PasswordAuthentication passAuth;

	public GoogleAuthentication() {
		passAuth = new PasswordAuthentication("mywns1231@gmail.com", "hnkcjcbqohnrssjd");
	}

	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}

	
	
}
