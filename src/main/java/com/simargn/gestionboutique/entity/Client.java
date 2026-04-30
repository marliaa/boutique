package com.simargn.gestionboutique.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="client")
@Data
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idClient;
    @Column(nullable = false)
    private String firstnameClient;
    @Column(nullable = false)
    private String lastnameClient;
    @Column(nullable = false)
    private String adressClient;
    @Column(nullable = false)
    private String phoneClient;
    private String emailClient;
    @Enumerated(EnumType.STRING)
   private String typeClient;
   public enum typeClient{
       Particulier,Entreprise
   }

}

