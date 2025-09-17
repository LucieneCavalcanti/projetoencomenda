package com.example.encomendas.entities;

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
import lombok.Setter;

@Entity
@Table(name = "encomendas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// ou @Data
public class EncomendaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Timestamp dataEncomenda;
    private Double valorTotal;
    private String entrega;
    private Timestamp dataEntrega;
    @OneToOne
    @JoinColumn(name="idpessoa", nullable = false)
    private PessoaEntity pessoa;
    @OneToOne
    @JoinColumn(name="idvendedor", nullable = false)
    private VendedorEntity vendedor;
    @OneToOne
    @JoinColumn(name="idfuncionario", nullable = false)
    private FuncionarioEntity funcionario;
    // lista de itens --> produtos
    @OneToMany
    private ArrayList<ItensEncomendaEntity> 
    itens;
}
