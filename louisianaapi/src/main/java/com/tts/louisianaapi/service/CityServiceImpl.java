package com.tts.louisianaapi.service;

import com.tts.louisianaapi.model.City;
import com.tts.louisianaapi.repo.CityRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {
    CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }


    @Override
    public Optional<City> getCity(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public Iterable<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public void save(City city) {

    }

}

