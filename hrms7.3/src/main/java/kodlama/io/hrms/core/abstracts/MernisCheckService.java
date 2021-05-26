package kodlama.io.hrms.core.abstracts;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.entities.concretes.JobSeeker;

@Service
public interface MernisCheckService {
	
	public boolean checkIfRealPerson(JobSeeker jobSeeker);

}

