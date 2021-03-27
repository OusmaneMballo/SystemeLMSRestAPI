package com.example.demo.controller;

import com.example.demo.entities.Etudiant;
import com.example.demo.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class EtudiantController {

    @Autowired
    EtudiantRepository etudiantRepos;

    @GetMapping("/etudiants")
    public List<Etudiant> findAll(){
        return etudiantRepos.findAll();
    }

    @RequestMapping(value = "/etudiant/{id}", method = RequestMethod.GET)
    public Etudiant findById(@PathVariable int id){
        return etudiantRepos.findById(id);
    }
}
