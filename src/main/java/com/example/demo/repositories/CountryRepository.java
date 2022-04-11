package com.example.demo.repositories;

import java.util.Optional;

import com.example.demo.datamodel.CountryJpa;
import com.example.demo.datamodel.assemblers.CountryDomainDataAssembler;
import com.example.demo.domain.entities.Country;
import com.example.demo.repositories.jpa.CountryJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CountryRepository {

	@Autowired
	CountryJpaRepository countryJpaRepository;
	@Autowired
	CountryDomainDataAssembler countryAssembler;

	public Country save( Country country ) {
		CountryJpa countryJpa = countryAssembler.toData(country);

		CountryJpa savedCountryJpa = countryJpaRepository.save( countryJpa );

		return countryAssembler.toDomain(savedCountryJpa);
	}

	public Optional<Country> findByCode(String code) {
		Optional<CountryJpa> opCountry = countryJpaRepository.findByCode(code);

		if ( opCountry.isPresent() ) {
			Country country = countryAssembler.toDomain(opCountry.get());
			return Optional.of( country );
		}
		else
			return Optional.empty();
	}
}