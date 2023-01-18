package com.example.example.ressources;

import com.example.example.dto.EtudiantDto;
import com.example.example.dto.EtudiantMoyenneDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;

@RestController
@RequestMapping("Etudiant")
public class EtudiantRessource {

    @GetMapping("exemple")
    public String helloWorld(){
        return "Bonjour";
    }

    @GetMapping("exemple2")
    public ResponseEntity<String> hello2(){
        ResponseEntity reponse = new ResponseEntity("deuxieme exemple", HttpStatus.BAD_GATEWAY);
        return reponse;
    }

    @GetMapping("exemple3/{prenom}")
    public ResponseEntity<String> exemple3(@PathVariable String prenom)
    {
        ResponseEntity reponse = new ResponseEntity("je m'appelle"+prenom, HttpStatus.OK);
        return reponse;
    }

    @GetMapping("exemple4")
    public ResponseEntity<String> exemple4(@RequestParam String prenom, @RequestParam int age){
        String message = "je m'appelle "+ prenom + "j'ai " + age + "ans";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping("exemple5")
    public ResponseEntity<String> toto (@RequestBody EtudiantDto dto){

        int age = Period.between(dto.getDate_naissance(), LocalDate.now()).getYears();
        String message = "je m'appelle "+ dto.getPrenom() + " " + dto.getNom() + "j'ai " + age + "ans";

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping ("avg")
    public ResponseEntity moyenne (@RequestBody EtudiantDto dto){

        // calcul de la moyenne
        float sum =0;

        for (int i =0; i<dto.getNotes().size(); i++){

            sum += dto.getNotes().get(i);
        }
        float avg = sum/dto.getNotes().size();

        EtudiantMoyenneDto reponse = new EtudiantMoyenneDto();

        reponse.setDiplay_name(dto.getPrenom() + " " +dto.getNom() );
        reponse.setMoyenne(avg);

        return new ResponseEntity(reponse, HttpStatus.OK);
    }
}
