package com.TonyYTan.driverLicense.Repostory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TonyYTan.driverLicense.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll(); // select * from Person
	//List<Person> findByNoLicense(); 
	List<Person> findByLicenseIdIsNull();
}
