package com.rasool.design.shark.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.rasool.design.shark.model.User;
import com.rasool.design.shark.repository.UserRepository;

@Component
public class customuserdetailsservice implements UserDetailsService{
 
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
	UserRepository userrepository = null;
	User user=userrepository.findByUsername(username);
	if(user!=null) {
		UserDetails userdetails=org.springframework.security.core.userdetails.User.builder().username(user.getUsername())
				.password(user.getPassword()).roles(user.getRoles().toArray(new String[0])).build();
		return userdetails;
	}
	throw new UsernameNotFoundException("username not found " +username);
	
	
	
			
			
	}
}
