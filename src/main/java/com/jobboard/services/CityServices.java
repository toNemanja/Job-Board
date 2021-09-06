package com.jobboard.services;

import com.jobboard.entity.City;
import com.jobboard.repository.CityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServices {

    @Autowired
    private CityRepository cityRepo;

    public List<City> findAll() {
        return cityRepo.findAll();
    }
}
