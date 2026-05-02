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
@Table(name = "facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfact;
    @Column(nullable = false)
    private LocalDate dateEmisfact;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatutFacture statutfact;
    public enum StatutFacture {
        LIVRE, NON_LIVRE
    }
    private  String note;
}
