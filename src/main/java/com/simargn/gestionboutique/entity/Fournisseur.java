package com.simargn.gestionboutique.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="fournisseur")
@Data
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfour;
    @Column(nullable = false)
    private String nameFournisseur ;
    @Column(nullable = false)
    private String adressFournisseur ;
    @Column(nullable = false)
    private String phoneFournisseur ;
    @Column(nullable = false)
    private String emailFournisseur ;
    @Column(nullable = false)
    private String paysFournisseur ;


}
