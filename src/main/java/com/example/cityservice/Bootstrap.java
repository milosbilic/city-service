package com.example.cityservice;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.cityservice.model.City;
import com.example.cityservice.repository.CityRepository;

@Component
public class Bootstrap {

	@Autowired
	private CityRepository repo;
	
	@PostConstruct
	public void initData() {
		City belgrade = new City("Belgrade", 1L);
		City noviSad = new City("Novi Sad", 1L);
		City nis = new City("Nis", 1L);
		
		City rome = new City("Rome", 2L);
		City milan = new City("Milan", 2L);
		City naples = new City("Naples", 2L);
		
		City london = new City("London", 3L);
		City liverpool = new City("Liverpool", 3L);
		City manchester = new City("Manchester", 3L);
		
		repo.saveAll( Arrays.asList(belgrade, noviSad, nis, rome, milan, naples,
				london, liverpool, manchester));
	}
	
}
