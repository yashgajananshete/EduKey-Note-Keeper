package com.edukey.takenote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edukey.takenote.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	

	//public boolean findByEmail(String email);

   public boolean existsByEmail(String email);

   public User findByEmail(String email);

	
}
