package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServices {

	
	@Autowired
	UserRepository  urepo;
	
	
	
	public String saveData(User user) {
		
		urepo.save(user);
		return "used data saved";
	}
	
	
	public List<User>  getAllData(){
		
		return urepo.findAll();
	}
	
	
}
