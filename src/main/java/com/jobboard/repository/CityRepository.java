
package com.jobboard.repository;

import com.jobboard.entity.City;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface CityRepository extends CrudRepository<City, Integer>{
    
    @Override
    public List<City> findAll();
}
