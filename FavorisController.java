package com.example.springbootmongodb;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/favoris")
public class FavorisController {
    FavorisRepository favorisRepository;

    public FavorisController(FavorisRepository favorisRepository) {
        this.favorisRepository = favorisRepository;
    }

    @RequestMapping(value = "/insert",method={RequestMethod.POST})
    public Favoris insertion(@RequestBody String data)throws Exception{
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(data);
        Favoris favoris = new Favoris();
        favoris.setIdClient((String)jsonObject.get("idClient"));
        favoris.setIdFilm((String)jsonObject.get("idFilm"));
        favoris.setDate((String)jsonObject.get("date"));
        return favorisRepository.insert(favoris);
    }

    @RequestMapping("/nbFavorisClient/{idClient}")
    public int getNbFavorisClient(@PathVariable("idClient") String idClient){
        return this.favorisRepository.countFavorisByIdClient(idClient);
    }

    @GetMapping("/nbClientFilm/{idFilm}")
    public int getNbClientFilm(@PathVariable("idFilm") String idFilm){
        return this.favorisRepository.countFavorisByIdFilm(idFilm);
    }
}
