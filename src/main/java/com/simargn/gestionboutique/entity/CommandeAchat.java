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
    private LocalDate datecmdachat;
    private LocalDate datelivreeprecmdachat;
    @Enumerated(EnumType.STRING)
    private SatutCmdAchat statut;
    public enum SatutCmdAchat {
        Reçu, NON_LIVRE
    }
}
