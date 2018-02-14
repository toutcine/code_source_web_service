package com.example.springbootmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CineRepository extends MongoRepository<Cine,String> {
    Cine findById(String id);
    
    List<Cine> findAll();

    List<Cine> findAllByGenre(String genre);

    List<Cine> findAllByAnneeDeSortie(String annee);

    List<Cine> findAllByAnneeDeSortieBefore(String annee);

    List<Cine> findAllByAnneeDeSortieAfter(String annee);

    List<Cine> findAllByCategorie(String categorie);
}
