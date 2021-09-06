package com.jobboard.repository;

import com.jobboard.entity.Employee;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Override
    public List<Employee> findAll();
}
