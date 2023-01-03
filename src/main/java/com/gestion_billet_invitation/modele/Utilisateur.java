package com.gestion_billet_invitation.modele;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Utilsateur")
@Data
@NoArgsConstructor
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column( length = 50)
    private String nom;
    @Column( length = 50)
    private String prenom;
    @Column( length = 100)
    private String adresse;
    @Column( length = 100)
    private String mail;
    private int numero;
    @Column( length = 50 , nullable = true)
    private String password;


}
