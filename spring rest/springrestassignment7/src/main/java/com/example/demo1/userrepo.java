package com.example.demo1;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepo extends MongoRepository<user,String> {

	user findByname(String name);

}
