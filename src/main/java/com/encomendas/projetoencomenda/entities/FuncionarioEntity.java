package com.encomendas.projetoencomenda.entities;
import lombok.Data;
import lombok.EqualsAndHashCode;

// @Getter
// @Setter
@Data
@EqualsAndHashCode(callSuper = true)
// @AllArgsConstructor
// @NoArgsConstructor
public class FuncionarioEntity extends PessoaEntity {
    private String cargo;
}
