package com.TonyYTan.Admin.Service;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TonyYTan.Admin.Repository.UserRepository;
import com.TonyYTan.Admin.models.User;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	
	public List<User> getAllUsers(){
		return this.uRepo.findAll();
	}
	
	
	public User getOneUser (Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	
	public User registerUser(User user) {
		//Generate a hash
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		//Set the hashed password on the users password field
		user.setPassword(hash);
		//save that new user password and the user object to the database
		return this.uRepo.save(user);
	}
	
	public User getUserByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
	
	public boolean authenticateUser(String email, String password) {
		//query user by email
		User user = this.uRepo.findByEmail(email);
		if(user ==null) {
			return false;
		}
		
		// step 2 check provided email against email in database
		return BCrypt.checkpw(password, user.getPassword());
	}
}
