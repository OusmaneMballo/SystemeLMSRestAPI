package com.example.demo.controller;

import com.example.demo.entities.Classe;
import com.example.demo.entities.Filiere;
import com.example.demo.repository.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class FiliereController {

    @Autowired
    FiliereRepository filiereRepos;

    @GetMapping("/filieres")
    public List<Filiere> findAll(){
        return filiereRepos.findAll();
    }

    @RequestMapping(value = "/filiere/add", method = RequestMethod.POST)
    public Filiere add(@RequestBody Filiere filiere){
        return  filiereRepos.saveAndFlush(filiere);
    }

    @RequestMapping(value = "/filiere/{id}", method = RequestMethod.GET)
    public Filiere findById(@PathVariable int id){return filiereRepos.findById(id);}
}
