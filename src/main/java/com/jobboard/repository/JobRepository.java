
package com.jobboard.repository;

import com.jobboard.entity.Job;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Integer>{
    
    @Override
    List<Job> findAll();
}
