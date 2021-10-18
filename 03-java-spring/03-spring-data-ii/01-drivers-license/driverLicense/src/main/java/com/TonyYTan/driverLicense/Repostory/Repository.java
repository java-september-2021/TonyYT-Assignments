package com.TonyYTan.driverLicense.Repostory;

import org.springframework.data.repository.CrudRepository;

import com.TonyYTan.driverLicense.models.Person;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository <Person, Long>{

}
