package com.ashokit.security;

//below all imported clases are predefined components from spring security
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

	//in spring security we can configure credentials in 3 ways (n-memory credential,jdbc credential,3 by using user details
	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		
		// than hardcoding we can retrieve the data from db return user obj(db logic)
		return new User("admin", "admin123", new ArrayList<>());
	}
}