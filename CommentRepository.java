package com.example.springbootmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment,String> {
    List<Comment> findAllByIdClient(String idClient);
    List<Comment> findAllByIdFilm(String idFilm);
    List<Comment> findAllByIdFilmOrderByDateDesc(String date);
    void deleteById(String id);
    int countCommentByIdFilm(String idFilm);
    int countCommentByIdClient(String idClient);

}
