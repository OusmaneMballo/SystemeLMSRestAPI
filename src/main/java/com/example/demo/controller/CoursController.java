package com.example.demo.controller;

import com.example.demo.entities.Cours;
import com.example.demo.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CoursController {

    @Autowired
    CoursRepository coursRepos;

    @GetMapping("/cours")
    public List<Cours> findAll(){
        return coursRepos.findAll();
    }

    @RequestMapping(value = "/cours{id}", method = RequestMethod.GET)
    public Cours findById(@PathVariable int id){
        return coursRepos.findById(id);
    }
}
