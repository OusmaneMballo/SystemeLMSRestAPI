package com.example.demo.repository;

import com.example.demo.entities.Classe;
import com.example.demo.entities.Cours;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CoursRepository extends JpaRepository<Cours, ID> {
    List<Cours> findAllByClasses(Classe classe);
    Cours findById(int id);
    @Override
    void delete(Cours cours);
}
