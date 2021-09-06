package com.jobboard.repository;

import com.jobboard.entity.Employer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface EmployerRepository extends CrudRepository<Employer, Integer> {

    @Override
    List<Employer> findAll();
    
    Employer findByUsername(String name);
}
