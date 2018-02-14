package com.example.springbootmongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cine")
public class Cine {
    @Id
    private String id;
    private String titre;
    private String categorie;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String genre;
    private String duree;
    private String acteur;
    private String realisateur;
    private String affiche;
    private String description;
    private String anneeDeSortie;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getActeur() {
        return acteur;
    }

    public void setActeur(String acteur) {
        this.acteur = acteur;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getAffiche() {
        return affiche;
    }

    public void setAffiche(String affiche) {
        this.affiche = affiche;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnneeDeSortie() {
        return anneeDeSortie;
    }

    public void setAnneeDeSortie(String anneeSortie) {
        this.anneeDeSortie = anneeSortie;
    }

    public Cine(String titre,String categorie,String genre,String duree,String acteur,String realisateur,String affiche,String description,String anneeDeSortie){
        setTitre(titre);
        setCategorie(categorie);
        setGenre(genre);
        setDuree(duree);
        setActeur(acteur);
        setRealisateur(realisateur);
        setAffiche(affiche);
        setDescription(description);
        setAnneeDeSortie(anneeDeSortie);
    }
}
