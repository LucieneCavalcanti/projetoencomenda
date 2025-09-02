package com.encomendas.projetoencomenda.entities;
import java.sql.Timestamp;
import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="encomendas")
public class EncomendaEntity {
    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private int id;
    private Timestamp datahora;
    // 1 encomenda possui 1 cliente
    @OneToOne
    @JoinColumn(name="idcliente", nullable=false)
    private PessoaEntity cliente;
    // 1 encomenda é cadastrada por 1 funcionário
    @OneToOne
    @JoinColumn(name="idfuncionario", nullable = false)
    private FuncionarioEntity funcionario;
    @NonNull
    private float total;
    @NonNull
    private float desconto;
    @NonNull
    private String formaPagamento; //enum ou entidade
    @NonNull
    private String status; //histórico --> entidade
    @NonNull
    private String entrega;
    // 1 - N com produtos -> DER
    @OneToMany
    private ArrayList<ItemEncomendaEntity> itens;
}
