package com.example.cityservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cityservice.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	List<City> findByCountryId(Long countryId);

}
