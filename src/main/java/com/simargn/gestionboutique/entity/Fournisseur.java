package com.simargn.gestionboutique.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="fournisseur")
@Data
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameFournisseur ;
    private String adressFournisseur ;
    private String phoneFournisseur ;
    private String emailFournisseur ;
    private String paysFournisseur ;


}
