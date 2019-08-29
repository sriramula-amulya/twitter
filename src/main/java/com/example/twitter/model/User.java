package com.example.twitter.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String username;
	
	private String password;
	
	
	public User() {
		super();
	}

	 @OneToMany(mappedBy="user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Tweets> tweets = new ArrayList<>();
	
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public void addTweet(Tweets tweet) {
    	this.tweets.add(tweet);
    	tweet.setUser(this);
    }

	

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password +  "]";
	}
	
}
