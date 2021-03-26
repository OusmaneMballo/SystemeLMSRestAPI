package com.example.demo.repository;

import com.example.demo.entities.Filiere;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FiliereRepository extends JpaRepository<Filiere, ID> {
    List<Filiere> findAll();
    Filiere findById(int id);

    @Override
    void delete(Filiere filiere);
}
