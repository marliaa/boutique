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
@Table(name = "livraison")
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivraison;
    private LocalDate dateLivraison;
    @Enumerated(EnumType.STRING)
    private StatutLivraison statut;
    public enum StatutLivraison {
        LIVRE, NON_LIVRE
    }
    private  String note;

}
