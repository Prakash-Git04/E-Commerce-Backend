package com.example.E_Commerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.E_Commerce.Entity.User;
import com.example.E_Commerce.Repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	UserRepository UserRepo;
	
	//Create
	public User Adduser( User A_user) {
		
		return UserRepo.save(A_user);
		
	}
	
	//Update
	public User Updateuser(User U_user) {
		return UserRepo.save(U_user);
	}
	
	//Get
	public List<User> Getuser() {
		
		return UserRepo.findAll();
		
	}
	
	public Optional<User> Getuserbyid(Long id) {
		return UserRepo.findById(id);
	}
	
	
	//Delete
	
	public void deleteuser(Long id) {	
		UserRepo.deleteById(id);
		
	}
	
	
	
	
	
	

}
