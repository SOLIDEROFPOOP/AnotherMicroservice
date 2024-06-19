package org.example.peopleservice;

import org.example.peopleservice.entity.People;
import org.example.peopleservice.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PeopleServiceApplication implements CommandLineRunner{
    @Autowired
    private PeopleRepository peopleRepository;
    public static void main(String[] args){
        SpringApplication.run(PeopleServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        People human1 = new People("Mura1","kek1",1);
        People human2 = new People("Mura2","kek2",2);
        peopleRepository.save(human1);
        peopleRepository.save(human2);
    }
}
