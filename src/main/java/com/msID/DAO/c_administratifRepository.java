package com.msID.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.msID.Entity.c_administratif;


@RepositoryRestResource
public interface c_administratifRepository extends JpaRepository<c_administratif, Long>{

}
