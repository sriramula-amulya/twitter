package com.example.twitter.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.twitter.Repository.UserRepository;
import com.example.twitter.model.Tweets;
import com.example.twitter.model.User;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public List<User> listAll() {
        return this.userRepository.findAll();
    }

    @Override
    @Transactional
    public User findById(long empId)  {
        return this.userRepository.findById(empId).get();
    }

    @Override
    @Transactional
    public void deleteUser(long empId) {
        this.userRepository.delete(this.userRepository.findById(empId).get());
    }
    
    
}
