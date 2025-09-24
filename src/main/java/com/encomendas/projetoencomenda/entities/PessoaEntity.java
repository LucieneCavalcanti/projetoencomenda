package com.encomendas.projetoencomenda.entities;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
@Getter
@Setter
// @Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pessoas")
@Inheritance(strategy = InheritanceType.JOINED) 
// Estratégia de herança com tabelas separadas 
public class PessoaEntity {
    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private int id;
    @Column(nullable = false, length = 200)
    private String nome;
    // 1 x N --> DER
    //@OneToMany
    private ArrayList<ContatoEntity> contatos;
}
