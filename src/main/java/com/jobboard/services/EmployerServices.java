package com.jobboard.services;

import com.jobboard.entity.Employer;
import com.jobboard.repository.EmployerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerServices {

    @Autowired
    private EmployerRepository employerRepository;
    
    public List<Employer> findAll(){
        return employerRepository.findAll();
    }
    
    public void save(Employer employer){
        employerRepository.save(employer);
    }
}
