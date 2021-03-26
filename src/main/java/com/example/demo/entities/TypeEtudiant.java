package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class TypeEtudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String libelle;

    @OneToMany(mappedBy = "typeEtudiant")
    private List<Etudiant> etudiants;

    public TypeEtudiant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
