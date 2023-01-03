package com.gestion_billet_invitation.modele;

import jakarta.persistence.*;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(length = 50)
    private String description;

    private  int prix ;

    @Column(length = 100)
    private String image;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,//
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "produit_utilisateur",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private List<Produit> produit= new ArrayList<>();
}
