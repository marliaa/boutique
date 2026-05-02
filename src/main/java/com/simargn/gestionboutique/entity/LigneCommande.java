package com.simargn.gestionboutique.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "lignecmd")
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLigneCmd;
    @Column(nullable = false)
    private int qteLigneCmd;
    @Column(nullable = false)
    private int qteLigneCmdLivree;
    @Column(nullable = false)
    private int prixunLigneCmd;
    @ManyToOne
    @JoinColumn(name = "refprod",referencedColumnName = "idorod")
    private Produit produit;
}
