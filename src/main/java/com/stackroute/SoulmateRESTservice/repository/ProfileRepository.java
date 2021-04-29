package com.stackroute.SoulmateRESTservice.repository;

import com.stackroute.SoulmateRESTservice.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends MongoRepository<Profile, Integer> {
   // findProfileByName()
}
