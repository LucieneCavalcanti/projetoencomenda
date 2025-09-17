package com.example.encomendas.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "funcionarios")
@PrimaryKeyJoinColumn(name="idpessoa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// ou @Data
public class FuncionarioEntity extends
PessoaEntity {
    private Float salario;
}
