package com.rabbit;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Repositoryu extends MongoRepository<Customer, String> {

}