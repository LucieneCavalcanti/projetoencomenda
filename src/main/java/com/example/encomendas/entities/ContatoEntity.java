package com.example.encomendas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "contatos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// ou @Data
public class ContatoEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String tipo;
    @NonNull
    @Column(length = 50)
    private String descricao;
    @OneToOne
    @JoinColumn(name="idpessoa",nullable = false)
    private PessoaEntity pessoa;
}
