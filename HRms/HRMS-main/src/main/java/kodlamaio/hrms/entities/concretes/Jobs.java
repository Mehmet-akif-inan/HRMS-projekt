package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="job_titles")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","JobAdvertisements"})
public class Jobs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	//@JsonIgnore
	private int id;
	
	@Column(name="title", unique = true)
	private String jobTitle;
	

	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvertisement> JobAdvertisements;
	
	public Jobs() {
		super();
	}
	public Jobs(int id, String jobTitle) {
		this.id = id;
		this.jobTitle = jobTitle;
	}

	public int getId() {
		return id;
	}

	public String getJobTitle() {
		return jobTitle;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	
}
