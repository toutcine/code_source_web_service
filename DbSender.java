package com.example.springbootmongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSender implements CommandLineRunner{
     private CineRepository cineRepository;

     public DbSender(CineRepository cineRepository){this.cineRepository=cineRepository;}

     @Override
     public void run(String... strings)throws  Exception{
         Cine oublijms = new Cine(
                 "N'oublie jamais",
                 "Film",
                 "Romance",
                 "2:03:06",
                 "Rachel McAdams",
                 "Rachel",
                 "image",
                 "Après avoir perdu la memoire, Noah tente de lire des histoires à Alli",
                 "2010"
         );

     }
}
