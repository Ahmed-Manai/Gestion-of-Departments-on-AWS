package com.msID.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.msID.Entity.etudiant;

@CrossOrigin("*") //error fix
@RepositoryRestResource
public interface etudiantRepository extends JpaRepository<etudiant, Long>{

}
