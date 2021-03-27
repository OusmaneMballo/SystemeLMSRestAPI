package com.example.demo.repository;

import com.example.demo.entities.Classe;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, ID> {

    //List<Classe> findAllByAnneeScolaire();
    Classe findClasseById(int id);
    @Override
    void delete(Classe classe);
}
