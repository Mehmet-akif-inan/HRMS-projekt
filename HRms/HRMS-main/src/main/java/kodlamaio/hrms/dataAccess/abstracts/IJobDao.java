package kodlamaio.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Jobs;

public interface IJobDao extends JpaRepository<Jobs,Integer>{
	boolean existsByJobTitle(String jobTitle);
}
