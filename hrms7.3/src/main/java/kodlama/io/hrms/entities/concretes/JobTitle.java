package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;


@Entity 
@Table(name="job_titles")
@Data
public class JobTitle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;
	
	
	public JobTitle() {}
	
	public JobTitle(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	}
}
