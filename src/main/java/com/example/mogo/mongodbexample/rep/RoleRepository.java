package com.example.mogo.mongodbexample.rep;


import java.util.Optional;

import com.example.mogo.mongodbexample.models.ERole;
import com.example.mogo.mongodbexample.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
