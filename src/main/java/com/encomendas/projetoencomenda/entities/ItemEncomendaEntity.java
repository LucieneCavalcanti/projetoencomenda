package com.encomendas.projetoencomenda.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="itensencomenda")
public class ItemEncomendaEntity {
    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private int id;
    private ProdutoEntity produto; // 1 - 1
    private float quantidade;
    private float preco;
}
