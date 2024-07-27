package com.example.demo.controller;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	UserServices  us;
	
	
	
	//save the user data
	
	
	@PostMapping("/save")
	public String saveUserData(@RequestBody User user) {
		
		
     return		us.saveData(user);
	}
	
	
	@GetMapping("/all")
	public List<User>  getAllUsers(){
		
		return us.getAllData();
	}
	
	@GetMapping("/test")
	public String testData() {
		
		return "testing for java http client";
	}
	
	
}
