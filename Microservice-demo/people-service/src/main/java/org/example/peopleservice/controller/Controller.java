package org.example.peopleservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.peopleservice.entity.People;
import org.example.peopleservice.repository.PeopleRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
@RequiredArgsConstructor
public class Controller {
    private final PeopleRepository peopleRepository;
    @GetMapping()
    public List<People> getAllPeople(){
        return peopleRepository.findAll();
    }
    @PostMapping("/add")
    private String add(@RequestBody People people){
        peopleRepository.save(people);
        return "added";
    }
}
