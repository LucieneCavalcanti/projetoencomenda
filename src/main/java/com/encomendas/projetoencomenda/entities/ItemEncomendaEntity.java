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
@NoArgsConstructor
public class ItemEncomendaEntity {
    private int id;
    private ProdutoEntity produto; // 1 - 1
    private float quantidade;
    private float preco;
}
