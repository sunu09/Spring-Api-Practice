package com.tts.louisianaapi.controller;

import com.tts.louisianaapi.model.City;
import com.tts.louisianaapi.repo.CityRepository;
import com.tts.louisianaapi.service.CityService;
import org.hibernate.Session;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/city")
@RestController
public class CityController {
    CityService cityService;


    public CityController(CityService cityService){

        this.cityService = cityService;
    }



    @GetMapping("/{id}")
    public Optional<City> getCityById(@PathVariable Long id){

        return cityService.getCity(id);
    }
    @GetMapping("/all")
    public Iterable<City>getAllCities(){
        return cityService.getAllCities();

    }


}
