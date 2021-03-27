package com.example.demo.controller;

import com.example.demo.entities.Classe;
import com.example.demo.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ClasseController {

    @Autowired
    ClasseRepository classeRepos;
    @GetMapping("/classes")
    public List<Classe> findAll(){
        return classeRepos.findAll();
    }

    @RequestMapping(value = "/classe/add", method = RequestMethod.POST)
    public Classe add(@RequestBody Classe classe){
        return  classeRepos.saveAndFlush(classe);
    }

    @RequestMapping(value = "/classe/{id}", method = RequestMethod.GET)
    public Classe findById(@PathVariable int id){return classeRepos.findClasseById(id);}
}
