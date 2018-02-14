package com.example.springbootmongodb;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cine")
public class CineController {
       private CineRepository cineRepository;

       public CineController(CineRepository cineRepository){
           this.cineRepository = cineRepository;
       }

        @GetMapping("/getAll")
        public List<Cine> getAll(){
            List<Cine> cines = this.cineRepository.findAll();
            return  cines;
        }

        @GetMapping("/getAllGenre/{genre}")//Comedi,Romance
        public List<Cine> getAllGenre(@PathVariable("genre") String genre){
            List<Cine> cines = this.cineRepository.findAllByGenre(genre);
            return  cines;
        }

        @GetMapping("/getAllAnnee/{annee}")
        public List<Cine> getAllAnnee(@PathVariable("annee") String annee){
            List<Cine> cines = this.cineRepository.findAllByAnneeDeSortie(annee);
            return  cines;
        }

        @GetMapping("/getAllAnneeAfter/{annee}")
        public List<Cine> getAllAnneeAfter(@PathVariable("annee") String annee){
            List<Cine> cines = this.cineRepository.findAllByAnneeDeSortieAfter(annee);
            return  cines;
        }

        @GetMapping("/getAllAnneeBefore/{annee}")
        public List<Cine> getAllAnneeBefore(@PathVariable("annee") String annee){
            List<Cine> cines = this.cineRepository.findAllByAnneeDeSortieBefore(annee);
            return  cines;
        }

        @GetMapping("/getAllCategorie/{categorie}") //Film,Serie
        public List<Cine> findAllByCategorie(@PathVariable("categorie") String categorie){
            List<Cine> cines = this.cineRepository.findAllByCategorie(categorie);
            return  cines;
        }

        @GetMapping("/getFiche/{id}")
        public Cine getById(@PathVariable("id") String id){
            Cine cine = this.cineRepository.findById(id);
            return cine;
        }

}
