package com.simargn.gestionboutique.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ligneachat")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LigneAchat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdLigneAchat;
    private int QteAchat;
    private int PuAchat;
}
