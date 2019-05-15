package com.example.supervisorlogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.supervisorlogin.demo.SupervisorPojo;
import com.example.supervisorlogin.repo.SupervisorRepository;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SupervisorController {
	@Autowired
	private SupervisorRepository repo;

	@PostMapping("/supervisor")
	public boolean validateUser(@RequestBody SupervisorPojo svlog) {

		System.out.println(svlog);
	List<SupervisorPojo> log=repo.findAll();
	for(SupervisorPojo dblog:log)
	{
System.out.println(dblog);
		if(dblog.getEmail().equals(svlog.getEmail())&&dblog.getPassword().equals(svlog.getPassword())) {
			return true;
		}
	}
	return false;
		}
	
}
