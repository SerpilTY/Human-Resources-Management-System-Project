package kodlama.io.hrms.core.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import kodlama.io.hrms.core.abstracts.MernisCheckService;
import kodlama.io.hrms.entities.concretes.JobSeeker;

@Component
@Primary
public class FakeMernisCheckAdapter implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		return true;
	}
	

}