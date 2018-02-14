package com.example.springbootmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MembreRepository extends MongoRepository<Membre,String> {
    Membre findByEmail(String user);
    Membre findByEmailAndPass(String user,String pass);
    Membre findById(String id);

}
