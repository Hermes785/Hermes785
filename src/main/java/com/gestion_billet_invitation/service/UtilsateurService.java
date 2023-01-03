package com.gestion_billet_invitation.service;

import com.gestion_billet_invitation.modele.Utilisateur;

import java.util.List;

public interface UtilsateurService {

    Utilisateur creer(Utilisateur utilisateur );

    List<Utilisateur> lire();

    Utilisateur modifier(Long id ,Utilisateur utilisateur);


    String supprimer(Long id);
}
