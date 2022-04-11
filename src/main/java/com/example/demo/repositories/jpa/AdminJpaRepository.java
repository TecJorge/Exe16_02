package com.example.demo.repositories.jpa;

import java.util.List;

import com.example.demo.datamodel.AdminJpa;

import org.springframework.data.repository.CrudRepository;

public interface AdminJpaRepository extends CrudRepository<AdminJpa, Long> {

    AdminJpa findById(long id);
    //List<AdminJpa> findAllByGroupId( GroupId id);
    List<AdminJpa> findAll();
}
