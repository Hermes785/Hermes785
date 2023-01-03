package com.gestion_billet_invitation.controller;

import com.gestion_billet_invitation.modele.Utilisateur;
import com.gestion_billet_invitation.service.UtilsateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/utililsateur")
@AllArgsConstructor
public class UtilsateurControlleur {

  private final  UtilsateurService utilsateurService;
@PostMapping("/create")
  public Utilisateur create(@RequestBody Utilisateur utilisateur){
      return utilsateurService.creer(utilisateur);
  }
  @GetMapping("/read")
  public List<Utilisateur> read(){
    return utilsateurService.lire();
  }


  @PutMapping("/update/{id}")
    public  Utilisateur  update(@PathVariable Long id,Utilisateur utilisateur){
     return  utilsateurService.modifier(id,utilisateur);
  }

    @DeleteMapping("/delete/{id}")

    public String delete(@PathVariable Long id) {
        return utilsateurService.supprimer(id);
    }


}
