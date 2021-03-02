package com.tts.louisianaapi.repo;

import com.tts.louisianaapi.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
//    Object findByStateOfResidence(String state);
}
