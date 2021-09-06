package com.jobboard.restcontrollers;

import com.jobboard.entity.Employee;
import com.jobboard.entity.Employer;
import com.jobboard.services.EmployeeServices;
import com.jobboard.services.EmployerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    EmployeeServices employeeServices;
    
    @Autowired
    EmployerServices employerServices;

    @PostMapping(value = "/register/saveUser", consumes = "application/json")
    public void saveUser(@RequestBody Employee employee) {
        employee.setPassword(bCryptPasswordEncoder.encode(employee.getPassword()));
        employeeServices.save(employee);
    }
    
    @PostMapping(value ="/register/saveEmployer",consumes = "application/json")
    public void saveEmployer(@RequestBody Employer employer){
        
        employer.setPassword(bCryptPasswordEncoder.encode(employer.getPassword()));
        employerServices.save(employer);
    }
}
