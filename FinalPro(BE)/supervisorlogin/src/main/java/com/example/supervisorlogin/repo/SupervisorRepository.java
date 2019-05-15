package com.example.supervisorlogin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.supervisorlogin.demo.SupervisorPojo;

public interface SupervisorRepository extends MongoRepository<SupervisorPojo,String>{

}
