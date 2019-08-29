package com.example.twitter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Tweets {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String message;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Tweets [id=" + id + ", message=" + message + ", user=" + user + "]";
	}



	
	
}
