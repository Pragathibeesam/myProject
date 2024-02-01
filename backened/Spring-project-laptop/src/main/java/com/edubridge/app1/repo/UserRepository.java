package com.edubridge.app1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.app1.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);

}
