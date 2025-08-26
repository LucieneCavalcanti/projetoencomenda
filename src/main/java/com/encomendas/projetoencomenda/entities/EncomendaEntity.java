package com.encomendas.projetoencomenda.entities;
import java.sql.Timestamp;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncomendaEntity {
    private int id;
    private Timestamp datahora;
    // 1 encomenda possui 1 cliente
    private PessoaEntity cliente;
    // 1 encomenda é cadastrada por 1 funcionário
    private FuncionarioEntity funcionario;
    private float total;
    private float desconto;
    private String formaPagamento;
    private String status;
    private String entrega;
    // 1 - N com produtos -> DER
    private ArrayList<ItemEncomendaEntity> itens;
}
