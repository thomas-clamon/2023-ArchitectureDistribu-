package com.example.example.dto;

public class EtudiantMoyenneDto {

    private String diplay_name; // concatenation du prenom et du nom

    private Float moyenne;

    public String getDiplay_name() {
        return diplay_name;
    }

    public void setDiplay_name(String diplay_name) {
        this.diplay_name = diplay_name;
    }

    public Float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(Float moyenne) {
        this.moyenne = moyenne;
    }
}
