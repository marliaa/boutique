package com.simargn.gestionboutique.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "produit")
@Data
public class Produit {
    @Id
    private Long id;


}
