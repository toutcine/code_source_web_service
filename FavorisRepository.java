package com.example.springbootmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FavorisRepository extends MongoRepository<Favoris,String> {
     int countFavorisByIdClient(String idClient);
     int countFavorisByIdFilm(String idFilm);
     //int findTopBycountFavorisByIdFilm;
}
