
package com.jobboard.restcontrollers;

import com.jobboard.entity.Job;
import com.jobboard.repository.EmployerRepository;
import com.jobboard.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobRestController {
    
    @Autowired
    JobRepository jobRepo;
    
    @Autowired
    EmployerRepository employerRepo;
    
    @PostMapping(value = "/save",consumes = "application/json")
    public void saveJob(@RequestBody Job job){
        System.out.println("usao u metodu");
        jobRepo.save(job);
    }
}
