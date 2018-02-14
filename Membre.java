package com.example.springbootmongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Membre")
public class Membre {
    @Id
    private String id;
    private String avatar;
    private String pseudonyme;
    private String pass;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int age;
    private String sexe;
    private String dateInscription;
    private String email;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPseudonyme() {
        return pseudonyme;
    }

    public void setPseudonyme(String pseudonyme) {
        this.pseudonyme = pseudonyme;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Membre(){
    }

    public Membre(String avatar,String pseudonyme,String pass,int age,String sexe,String dateInscription,String email){
        setAvatar(avatar);
        setPseudonyme(pseudonyme);
        setPass(pass);
        setAge(age);
        setSexe(sexe);
        setDateInscription(dateInscription);
        setEmail(email);
    }
}
