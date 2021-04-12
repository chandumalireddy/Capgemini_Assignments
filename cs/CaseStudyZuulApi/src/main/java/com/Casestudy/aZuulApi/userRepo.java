package com.Casestudy.aZuulApi;


  
  import org.springframework.data.mongodb.repository.MongoRepository;
  
  
  public interface userRepo extends MongoRepository<user,String>{
  
  user findByUsername(String username);
  
  
  }
 