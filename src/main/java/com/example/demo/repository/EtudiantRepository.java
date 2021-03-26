package com.example.demo.repository;

import com.example.demo.entities.Classe;
import com.example.demo.entities.Etudiant;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, ID> {
    List<Etudiant> findAllByClasse(Classe classe);
    Etudiant findById(int id);

    @Override
    void delete(Etudiant etudiant);
}
