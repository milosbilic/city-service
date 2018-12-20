package com.example.cityservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cityservice.model.City;
import com.example.cityservice.repository.CityRepository;

@RestController
public class CityController {

	@Autowired
	private CityRepository repository;
	
	@GetMapping
	public List<City> listAll() {
		return repository.findAll();
	}
	
	@GetMapping("/country/{countryId}")
	public List<City> findAllByCountry(@PathVariable Long countryId) {
		return repository.findByCountryId(countryId);
	}
	
}
