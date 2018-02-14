package com.example.springbootmongodb;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/comment")
public class CommentController {
   private CommentRepository commentRepository;

   public CommentController(CommentRepository commentRepository){this.commentRepository = commentRepository; }

   @GetMapping("/all")
   public List<Comment> getAll(){
       List<Comment> comments = this.commentRepository.findAll();
       return  comments;
   }

    @RequestMapping(value = "/insert",method={RequestMethod.POST})
    public Comment addComment(@RequestBody String data)throws Exception{
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(data);
        Comment comment = new Comment();
        comment.setIdClient((String)jsonObject.get("idClient"));
        comment.setIdFilm((String)jsonObject.get("idFilm"));
        comment.setDate((String)jsonObject.get("date"));
        comment.setCommentaire((String)jsonObject.get("commentaire"));
        commentRepository.insert(comment);
        return comment;
    }

    @GetMapping("/getAllClient/{idClient}")
    public List<Comment> getAllClient(@PathVariable("idClient") String idClient){
        List<Comment> comments = this.commentRepository.findAllByIdClient(idClient);
        return comments;
    }

    @GetMapping("/getAllFilm/{idFilm}")
    public List<Comment> getAllFilm(@PathVariable("idFilm") String idFilm){
        List<Comment> comments = this.commentRepository.findAllByIdFilm(idFilm);
        return comments;
    }

    @GetMapping("/getAllFilmDec/{date}")
    public List<Comment> getAllFilmDec(@PathVariable("date") String date){
        List<Comment> comments = this.commentRepository.findAllByIdFilmOrderByDateDesc(date);
        return comments;
    }

    @GetMapping("/delete")
    public void deleteComment(){
        this.commentRepository.deleteAll();
    }

    @GetMapping("/deleteComment/{id}")
    public void deleteCommentById(@PathVariable("id") String id){
        this.commentRepository.deleteById(id);
    }

    @GetMapping("/nombreCommentaireFilm/{idFilm}")
    public int getNbCommentByFilm(@PathVariable("idFilm") String idFilm){
        return this.commentRepository.countCommentByIdFilm(idFilm);
    }

    @GetMapping("/nombreCommentaireClient/{idClient}")
    public int getNbCommentByClient(@PathVariable("idClient") String idClient){
        return this.commentRepository.countCommentByIdClient(idClient);
    }

}
