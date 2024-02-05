package com.edukey.takenote.service;

import com.edukey.takenote.entity.User;

public interface UserService {
	
	User saveUser(User user);
	
	boolean emailExistOrNot(String email);
	
	 public User getUserByEmail(String email);
	 
	 

}
