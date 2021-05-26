package kodlama.io.hrms.core.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.abstracts.EmailSendService;
import kodlama.io.hrms.eMailService.EMailSendManager;

@Service
public class EmailSendManagerAdapter implements EmailSendService {

	private EMailSendManager emailSendManager;

	@Autowired
	public EmailSendManagerAdapter(EMailSendManager emailSendManager) {
		this.emailSendManager = emailSendManager;
	}

	@Override
	public void emailSend(String email) {
		emailSendManager.emailSending(email);

	}

}