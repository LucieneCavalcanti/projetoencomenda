package com.encomendas.projetoencomenda.entities;
import java.util.ArrayList;
import lombok.Data;

// @Getter
// @Setter
@Data
// @AllArgsConstructor
// @NoArgsConstructor
public class PessoaEntity {
    private int id;
    private String nome;
    // 1 x N --> DER
    //@OneToMany
    private ArrayList<ContatoEntity> contatos;
}
