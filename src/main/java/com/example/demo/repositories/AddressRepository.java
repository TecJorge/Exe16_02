package com.example.demo.repositories;

import com.example.demo.datamodel.assemblers.PersonDomainDataAssembler;
import com.example.demo.repositories.jpa.AddressJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressRepository {

	@Autowired
	AddressJpaRepository addressJpaRepository;
	@Autowired
	PersonDomainDataAssembler addressAssembler;
}