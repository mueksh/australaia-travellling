package com.pham.austravelling.austravelling.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pham.austravelling.austravelling.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>  {

}
