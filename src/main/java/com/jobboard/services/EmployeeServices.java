
package com.jobboard.services;

import com.jobboard.entity.Employee;
import com.jobboard.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
    
    @Autowired
    private EmployeeRepository employeeRepo;
    
    public List<Employee> findAll(){
        return employeeRepo.findAll();
    }
    
    public void save(Employee employee){
        employeeRepo.save(employee);
    }
}
