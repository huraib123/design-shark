package com.rasool.design.shark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.rasool.design.shark.model.User;
import com.rasool.design.shark.repository.UserRepository;
import com.rasool.design.shark.security.customuserdetailsservice;
import com.rasool.design.shark.security.jwtutil;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {
  
	@Autowired	
	private UserRepository userrepo;
	
	@Autowired
	customuserdetailsservice cuds;
	 @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	 @Autowired
	 AuthenticationManager authmanager;
	 @Autowired
	 private jwtutil ju;
	 static final PasswordEncoder passenco=new BCryptPasswordEncoder();
	@PostMapping("/sign up")
  public User  newuser1(@RequestBody User newuser) {
		newuser.setPassword(passenco.encode(newuser.getPassword()));
		return  userrepo.save(newuser);
	}
	@PostMapping("/login")
	  public ResponseEntity<String>  newuser(@RequestBody User newuser) {
		try {
		
			authmanager.authenticate(
					new UsernamePasswordAuthenticationToken(newuser.getUsername(),newuser.getPassword()));
			UserDetails userdetails=cuds.loadUserByUsername(newuser.getUsername());
			String jwt=ju.generateToken(userdetails.getUsername());
			return new ResponseEntity<>(jwt,HttpStatus.OK);
		}
		catch(Exception e) {
			
			return new ResponseEntity<>("Incorrect username or passowrd",HttpStatus.BAD_REQUEST);
		}
		
			
		}
	@GetMapping("/admin")
	List<User> getallusers(){
		return userrepo.findAll();
	}
	
}
 