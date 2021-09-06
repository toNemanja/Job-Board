
package com.jobboard.services;

import com.jobboard.entity.FieldOfWork;
import com.jobboard.repository.FieldOfWorkRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldOfWorkServices {
    
    @Autowired
    private FieldOfWorkRepository fieldOfWorkRepo;
    
    public List<FieldOfWork> findAll(){
        return fieldOfWorkRepo.findAll();
    }
}
