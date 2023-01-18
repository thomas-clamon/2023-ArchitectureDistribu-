package com.example.example.dto;

import java.time.LocalDate;
import java.util.List;

public class EtudiantDto {

    private String nom;
    private String prenom;

    private LocalDate date_naissance;

    private List<Float> notes;

    public List<Float> getNotes() {
        return notes;
    }

    public void setNotes(List<Float> notes) {
        this.notes = notes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }
}
