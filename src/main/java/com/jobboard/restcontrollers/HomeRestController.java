package com.jobboard.restcontrollers;

import com.jobboard.entity.City;
import com.jobboard.entity.FieldOfWork;
import com.jobboard.services.CityServices;
import com.jobboard.services.FieldOfWorkServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeRestController {

    @Autowired
    private CityServices cityServices;
    
    @Autowired FieldOfWorkServices fieldOfWorkServices;

    @GetMapping("/displayCities")
    public List<City> displayCities() {
        return cityServices.findAll();
    }
    
    @GetMapping("/displayFieldOfWork")
    public List<FieldOfWork> displayFieldOfWork(){
        return fieldOfWorkServices.findAll();
    }
}
