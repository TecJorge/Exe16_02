package com.example.demo.services;

import com.example.demo.domain.entities.Country;
import com.example.demo.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public CountryService() {
    }

    public Country createAndSaveCountry( String code, String name ) {
        Country country = new Country(code, name);
        return countryRepository.save(country);
    }
}
