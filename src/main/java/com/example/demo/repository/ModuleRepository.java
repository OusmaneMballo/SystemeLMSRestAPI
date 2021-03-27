package com.example.demo.repository;

import com.example.demo.entities.Module;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepository extends JpaRepository<Module, ID> {
    List<Module> findAll();
    Module findById(int id);
    @Override
    void delete(Module module);
}
