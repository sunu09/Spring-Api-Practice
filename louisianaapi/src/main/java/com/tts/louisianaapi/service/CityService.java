package com.tts.louisianaapi.service;

import com.tts.louisianaapi.model.City;

import java.util.Optional;

public interface CityService {

    Optional<City> getCity(Long id);
    Iterable<City> getAllCities();

    void save(City city);
}
