
package com.jobboard.repository;

import com.jobboard.entity.FieldOfWork;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface FieldOfWorkRepository extends CrudRepository<FieldOfWork,Integer> {
    
    @Override
    public List<FieldOfWork> findAll();
}
