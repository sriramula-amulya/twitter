package com.example.twitter.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.twitter.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
	    List<User> findAll();
}
