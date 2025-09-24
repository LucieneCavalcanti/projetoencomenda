package com.encomendas.projetoencomenda.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
// @EqualsAndHashCode(callSuper = true)
// @AllArgsConstructor
@NoArgsConstructor//construtor nulo ou vazio
@AllArgsConstructor
@Entity
@Table(name="vendedores")
@PrimaryKeyJoinColumn(name="idpessoa")
public class VendedorEntity extends PessoaEntity{
    private float comissao;
}
