package com.example.springbootmongodb;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/membre")
public class MembreController {
     private MembreRepository membreRepository;

     public MembreController(MembreRepository membreRepository){
         this.membreRepository = membreRepository;
     }

    @GetMapping("/getAll")
    public List<Membre> getAll(){
        List<Membre> membres = this.membreRepository.findAll();
        return  membres;
    }

    @GetMapping("/getDetail/{id}")
    public Membre getDetail(@PathVariable("id") String id){
        Membre membre = this.membreRepository.findById(id);
        return  membre;
    }
    /*@RequestMapping(value = "/insert",method={RequestMethod.POST})
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
    }*/

    @RequestMapping(value = "/insert",method={RequestMethod.POST})
    public Membre addUser(@RequestBody String data)throws Exception{
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(data);
        Membre membre = new Membre();
        membre.setAvatar((String)jsonObject.get("avatar"));
        membre.setPseudonyme((String)jsonObject.get("pseudonyme"));
        membre.setPass((String)jsonObject.get("pass"));
        membre.setAge(((Long)jsonObject.get("age")).intValue());
        membre.setSexe((String)jsonObject.get("sexe"));
        membre.setDateInscription((String)jsonObject.get("dateInscription"));
        membre.setEmail((String)jsonObject.get("email"));
        membreRepository.insert(membre);
        return membre;
    }

    @GetMapping("/login/{user}/{pass}")
    public Membre login(@PathVariable("user") String user,@PathVariable("pass") String pass){
        Membre membre = new Membre();
        if(this.membreRepository.findByEmail(user)!= null){
            if(membreRepository.findByEmailAndPass(user,pass) == null){
                membre.setId("1");
            }else{
                membre = membreRepository.findByEmailAndPass(user,pass);
            }
        }else {
            membre.setId("0");
        }
        return membre;
    }







}
