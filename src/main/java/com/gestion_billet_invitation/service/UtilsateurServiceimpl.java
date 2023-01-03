package com.gestion_billet_invitation.service;

import com.gestion_billet_invitation.modele.Utilisateur;
import com.gestion_billet_invitation.repository.UtilisateurRipository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UtilsateurServiceimpl implements  UtilsateurService {

//injection par constructeur

   private  UtilisateurRipository  utilisateurRipository;

    @Override
    public Utilisateur creer(Utilisateur utilisateur) {
        return utilisateurRipository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> lire() {
        return utilisateurRipository.findAll();
    }

    @Override
    public Utilisateur modifier(Long id, Utilisateur utilisateur) {
        return utilisateurRipository.findById(id)
                .map(p->{
            p.setNom(utilisateur.getNom());
            p.setPrenom(utilisateur.getPrenom());
            p.setAdresse(utilisateur.getAdresse());
            p.setMail(utilisateur.getMail());
            p.setNumero(utilisateur.getNumero());
            p.setPassword(utilisateur.getPassword());
            return  utilisateurRipository.save(p);
        }).orElseThrow(()->new RuntimeException("Echec de la modification,une erreur est survenu"));
    }

    @Override
    public String supprimer(Long id) {
         utilisateurRipository.deleteById(id);
         return "";
    }
}
