package com.TonyYTan.ProductAndCategories.Service;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TonyYTan.ProductAndCategories.Repository.UserRepository;
import com.TonyYTan.ProductAndCategories.models.User;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public List<User> findAllUsers(){
		return this.uRepo.findAll();
	}
	
	public User getOneUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	
}
