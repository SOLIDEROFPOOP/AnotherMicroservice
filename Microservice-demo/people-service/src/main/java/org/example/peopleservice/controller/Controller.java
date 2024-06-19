package org.example.peopleservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.peopleservice.entity.People;
import org.example.peopleservice.repository.PeopleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
