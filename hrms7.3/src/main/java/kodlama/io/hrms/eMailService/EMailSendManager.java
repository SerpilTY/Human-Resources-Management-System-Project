package kodlama.io.hrms.eMailService;

import org.springframework.stereotype.Service;

@Service
public class EMailSendManager {
	
	public void emailSending(String email) {
		System.out.println("Verification mail sent to this e-mail address: " +email );
	}

}