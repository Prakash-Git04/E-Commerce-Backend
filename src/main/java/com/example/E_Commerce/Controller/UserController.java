package com.example.E_Commerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.E_Commerce.Entity.User;
import com.example.E_Commerce.Service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService UseServ;
	
	
	
	@PostMapping("/createuser")
	public User Create( @RequestBody User user) {
		
		return UseServ.Adduser( user);
	}
	

    // Get All Users
    @GetMapping("/Getuser")
    public List<User> getAllUsers() {
		return UseServ.Getuser();
    }
    

    // Get User By ID
    @GetMapping("/GetbyIduser/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return UseServ.Getuserbyid(id);
    }
    
    
    // Update User
    @PutMapping("/Updateuser")
    public User updateUser(@RequestBody User user) {
    	
        return UseServ.Updateuser(user);   
    }

    // Delete User
    @DeleteMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable Long id) {
    	UseServ.deleteuser(id);
		return "Deletesuccesfull";

        }

	
	
	
	
}
