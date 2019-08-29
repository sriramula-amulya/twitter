package com.example.twitter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.twitter.Service.UserService;
import com.example.twitter.model.Tweets;
import com.example.twitter.model.User;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	private long tempId;
	 @GetMapping(value = "/login")
	    public String login(Model model){
	        System.out.println("Came inside the login method ");
	        return "login";
	    }
	 
	 @PostMapping("/login")
	    public String loginUser(
	            @RequestParam("username")String username,
	            @RequestParam("password") String password,
	            Model model){
		 	List<User> users=this.userService.listAll();
		 	System.out.println(users);
	        for(int i=0;i<users.size();i++) {
	        	if(users.get(i).getUsername().equals(username) && users.get(i).getPassword().equals(password))
	        	{
	        		model.addAttribute("user", username);
	        		model.addAttribute("id",users.get(i).getId());
	        		model.addAttribute("tweet",users.get(i).getTweets());
	        		this.tempId=users.get(i).getId();
	        		model.addAttribute("status","");
	                return "success";
	        	}
	        }
	        model.addAttribute("status","Username/Password Incorrect");
	        return "login";
	    }
	 @GetMapping("/register")
	 public String RegisterPage() {
		 return "register";
	 }
	 @PostMapping("/register")
	    public String register(@RequestParam("username")String username,
	            @RequestParam("password") String password,
	            Model model) {
	    	User e=new User(username,password);
	    	this.userService.saveUser(e);
//		 	List<User> users=this.userService.listAll();
//		 	System.out.println(users);
	    	return "redirect:/users/login";
	   }
	 
	 @GetMapping("/success")
	    public String home(Model model){
	        return "success";
	    }
	 

	 @PostMapping("/tweet")
	    public String tweet(@RequestParam("tweet")String tweet,Model model){
		 		Tweets tweetobj = new Tweets();
		 		tweetobj.setMessage(tweet);
		 		User user=this.userService.findById(this.tempId);
		 		model.addAttribute("user", user.getUsername());
		 		model.addAttribute("tweets",user.getTweets());
		 		System.out.println("kkkkkk "+user);
		 		//tweetobj.setUser(user);
		 		user.addTweet(tweetobj);
		 		System.out.println("kkkkkk "+user);
		 		this.userService.saveUser(user);
		 		return "success";
	    }
	 
}
