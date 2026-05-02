package com.simargn.gestionboutique.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "produit")
@Data
public class Produit {
    @Id
    private Long idprod;
    @Column(nullable = false)
    private String desprod;
    @Column(nullable = false)
    private int qtestock;
    @Column(nullable = false)
    private int prixprod;
    @ManyToOne
    @JoinColumn(name = "idFour",referencedColumnName = "idfour")
    private Fournisseur fournisseur;


}
