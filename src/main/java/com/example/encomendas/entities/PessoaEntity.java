package com.example.encomendas.entities;

import java.util.ArrayList;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// ou @Data
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Column(length = 600)
    private String nome;
    @NonNull
    @Column(length = 50)
    private String login;
    @NonNull
    @Column(length = 20)
    private String senha;
    @NonNull
    @Column(length = 14)
    private String cpf;
    //1 x N --> 1 pessoa possui 1 ou muitos contatos
    @OneToMany
    private ArrayList<ContatoEntity> contatos;
}
