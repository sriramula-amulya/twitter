package com.example.twitter.Service;

import java.util.List;

import com.example.twitter.model.User;


public interface UserService {
	
	User saveUser(User user);

    List<User> listAll();

    User findById(long userid);

    void deleteUser(long userid);
}
