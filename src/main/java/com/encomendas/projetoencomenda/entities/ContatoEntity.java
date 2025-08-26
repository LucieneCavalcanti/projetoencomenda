package com.encomendas.projetoencomenda.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor //construtor nulo ou vazio
public class ContatoEntity {
    private int id;
    private String tipo;
    private String descricao;
}
