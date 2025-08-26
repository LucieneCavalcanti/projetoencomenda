package com.encomendas.projetoencomenda.entities;
import lombok.Data;
import lombok.EqualsAndHashCode;

// @Getter
// @Setter
@Data
@EqualsAndHashCode(callSuper = true)
// @AllArgsConstructor
// @NoArgsConstructor//construtor nulo ou vazio
public class VendedorEntity extends PessoaEntity{
    private float comissao;
}
