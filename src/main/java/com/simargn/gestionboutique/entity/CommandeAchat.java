package com.simargn.gestionboutique.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "commandeachat")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommandeAchat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcmdachat;
    @Column(nullable = false)
    private LocalDate datecmdachat;
    @Column(nullable = false)
    private LocalDate datelivreeprecmdachat;
    @Column(nullable = false)
    private int montantcmdAchat;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SatutCmdAchat statut;
    public enum SatutCmdAchat {
        Reçu, NON_LIVRE
    }
    @ManyToOne
    @JoinColumn(name = "idFour",referencedColumnName = "idfou")
    private Fournisseur fournisseur;

}
