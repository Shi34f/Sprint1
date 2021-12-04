package com.user.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.model.User;
import com.user.service.UserService;

@RestController
public class UserController {
		@Autowired
		private UserService userService;//Dependency injection
		
		@RequestMapping(value="/", method = RequestMethod.GET)
		   public String welcome() {
			  return "Welcome to Our Restauranat ";
		}
		
		
		@RequestMapping(value="/user", method=RequestMethod.POST)
		   public User addDetails(@Validated @RequestBody User user) {
			  return userService.addDetails(user);
			
			
		}
		@RequestMapping(value="/user", method=RequestMethod.GET)
		   public List<User> getAllDetails() {
			  return userService.getAllDetails(); 
		}
		
		
		

		@RequestMapping(value="/user/{userId}", method=RequestMethod.GET )
		public User getUserDetailsById(@PathVariable("userId") int uId) {
			Optional<User> user = userService.getDetailsById(uId);
			return user.get();
			
		}
		
		
		
		
			@RequestMapping(value="/user", method=RequestMethod.PUT )
			public User updateDetails(@RequestBody User user) {
				
				return userService.updateDetail(user);	
			}
			
			@RequestMapping(value="/user/{userId}", method=RequestMethod.DELETE)
			public String deleteUserDetails(@PathVariable("userId") int uId) {
				Optional<User> u = userService.getDetailsById(uId);
				if(u.isPresent()) {
				    userService.deleteDetailsById(uId);
					return "The Bank Details deleted with the user Id: "+uId;
				}
				
				return "The Bank Details Not deleted with the user Id: "+uId;
				
			}
		
	}
			


