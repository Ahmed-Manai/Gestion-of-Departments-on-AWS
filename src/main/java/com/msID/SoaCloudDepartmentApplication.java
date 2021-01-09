package com.msID;

import java.util.Random;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.msID.DAO.c_administratifRepository;
import com.msID.DAO.enseignantRepository;
import com.msID.DAO.etudiantRepository;
import com.msID.Entity.c_administratif;
import com.msID.Entity.enseignant;
import com.msID.Entity.etudiant;

@EnableDiscoveryClient
@SpringBootApplication
public class SoaCloudDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoaCloudDepartmentApplication.class, args);
	}
	@Bean
	CommandLineRunner start_etudiant(etudiantRepository etudiantRepository) {
		return args ->{
			Stream.of("A","B","C").forEach(cn->{
				etudiantRepository.save(new etudiant(null,cn,new Random().nextInt(5),100+Math.random()*900));
			});
			etudiantRepository.findAll().forEach(System.out::println);
		};
	}
	@Bean
	CommandLineRunner start_enseignant(enseignantRepository enseignantRepository) {
		return args ->{
			Stream.of("D","E","F").forEach(cn->{
				enseignantRepository.save(new enseignant(null,cn,cn,cn));
			});
			enseignantRepository.findAll().forEach(System.out::println);
		};
	}
	@Bean
	CommandLineRunner start_c_administratif(c_administratifRepository c_administratifRepository) {
		return args ->{
			Stream.of("G","H","K").forEach(cn->{
				c_administratifRepository.save(new c_administratif(null,cn,cn,cn));
			});
			c_administratifRepository.findAll().forEach(System.out::println);
		};
	}

}
