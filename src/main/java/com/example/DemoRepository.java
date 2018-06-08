package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo;

@Repository
public interface DemoRepository extends MongoRepository<Demo,String> {

}
