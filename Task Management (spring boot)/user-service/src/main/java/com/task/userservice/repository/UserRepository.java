package com.task.userservice.repository;


import com.task.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
