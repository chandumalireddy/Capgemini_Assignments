
  package com.casestudy.user;
  
  import java.util.Optional;
  
  
  import org.springframework.data.mongodb.repository.MongoRepository;
  
  public interface userRepo extends MongoRepository<user,String>{
  
  user findByUsername(String username);
  
  boolean existsByUsername(String username);
  
  
  }
 