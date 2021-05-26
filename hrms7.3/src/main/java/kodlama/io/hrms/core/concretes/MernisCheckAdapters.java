package kodlama.io.hrms.core.concretes;
import java.rmi.RemoteException;
import org.springframework.stereotype.Component;
import kodlama.io.hrms.core.abstracts.MernisCheckService;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisCheckAdapters implements MernisCheckService{
	
	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(
						Long.valueOf(jobSeeker.getNationalIdentityNumber()), 
						jobSeeker.getFirstName().toUpperCase(), 
						jobSeeker.getLastName().toUpperCase(), 
						jobSeeker.getDateOfBirth());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;

	}

}