package com.gestion_billet_invitation.repository;

import com.gestion_billet_invitation.modele.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UtilisateurRipository extends JpaRepository <Utilisateur, Long>{


}
