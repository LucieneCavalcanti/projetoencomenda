package com.example.encomendas.entities;
import jakarta.persistence.Column;
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

@Entity
@Table(name = "produtos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// ou @Data
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long codigo;
    @NonNull
    @Column(name = "descricao", nullable = false, length = 300)
    private String descricao;
    @Column(name = "valor", nullable = false)
    private Float valor;
}
