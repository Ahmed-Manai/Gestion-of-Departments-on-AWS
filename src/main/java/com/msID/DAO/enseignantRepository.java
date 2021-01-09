package com.msID.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.msID.Entity.enseignant;


@RepositoryRestResource
public interface enseignantRepository extends JpaRepository<enseignant, Long>{

}
